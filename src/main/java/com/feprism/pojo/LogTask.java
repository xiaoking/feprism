package com.feprism.pojo;

import com.feprism.entity.PageInfo;
import com.feprism.entity.ScriptInfo;
import com.feprism.entity.WebElement;
import com.feprism.entity.WebPage;
import com.feprism.service.AccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mac on 15/12/23.
 */
@Component
public class LogTask {
    //常量
    public static final String logPrefix = "--access--log--";
    public static final String logSpliter = "\t";

    @Autowired
    private AccessLogService accessLogService;

    public static String getLogPrefix() {
        return logPrefix;
    }

    public static String getLogSpliter() {
        return logSpliter;
    }

    public AccessLogService getAccessLogService() {
        return accessLogService;
    }

    public void setAccessLogService(AccessLogService accessLogService) {
        this.accessLogService = accessLogService;
    }

    @Scheduled(cron="0 0 24 * * ?")
//    @Scheduled(cron="0/60 * *  * * ? ")   //每5秒执行一次
    public void taskSaveLogToDatabase() {
        try{
            String logFile = "/opt/logs/access_log";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            logFile+="."+dateFormat.format(new Date(new Date().getTime()-24*60*60*1000 ) )+".log";
            List<AccessLog> list = this.readerLogFile(logFile);

            //保存到数据库
            save(list);
        }catch (Exception ex){
            //将错误记录在日志中
        }
    }

    private List<AccessLog> readerLogFile(String logFile) throws IOException{

        String tmp = null;
        Matcher matcher = null;
        List<AccessLog> list = new ArrayList<AccessLog>();

        RandomAccessFile randomFile = new RandomAccessFile(logFile,"r");

        Pattern logPattern = Pattern.compile(getLogPrefix()+".*");

        while ((tmp = randomFile.readLine()) != null) {
            //这里需要判断是否是我需要的日志信息，如果是，放入实体类，然后返回
            matcher = logPattern.matcher(tmp);
            if(matcher.matches() ){
                //如果日志符合规则，将解析成AccessLog,判断后保存;
                list.add(parse(tmp) );
            }
        }
        return list;
    }

    private void save(List<AccessLog> list){
        Iterator<AccessLog> iterator = list.iterator();
        List<ScriptInfo> scriptInfoList = new ArrayList<ScriptInfo>();
        List<PageInfo> pageInfoList = new ArrayList<PageInfo>();
        List<WebElement> webElementList = new ArrayList<WebElement>();
        List<WebPage> webPageList = new ArrayList<WebPage>();

        while (iterator.hasNext() ){
            //分别存入script、pageinfo、page
            AccessLog accessLog = iterator.next();
            //如果有错误日志，添加到scripterror
            if(!accessLog.getScriptError().toLowerCase().equals("null") ){
                scriptInfoList.add(new ScriptInfo(

                ));
            }

            if(!accessLog.getTotalTime().toLowerCase().equals("null") ){
                pageInfoList.add(new PageInfo() );
            }

            if(!accessLog.getElement().toLowerCase().equals("null") ){
                webElementList.add(new WebElement() );
            }

            webPageList.add(new WebPage() );
        }

        //存库
        //查询出所有的page页，根据网站主标识  页面名称和id和标识
        //Map<String,Object> pageMap = this.accessLogService.getPageForWebSiteId()
    }

    private AccessLog parse(String str){

        String[] arr= str.split(getLogSpliter() );
        AccessLog accessLog= new AccessLog();
        /**
         *
         *
         *  String ip,String domain,String url,String referrer, String pageName, String pageOnlyId,
            String badTime, String firstScreenTime,String operationTime, String totalTime, String scriptError, String periodTime,
            String browserType, String browserVersion, String browserEnvironment, String screen,
            Integer pv, Integer uv,
            String clickTime, String element, String elementContext, String elementId, String elementName, String elementCustom, String elementOffset, String elementFatherTag,
               String dns,String leaveTime,
            String userLogin
         * */
        accessLog.setIp(arr[1]);
        accessLog.setDomain(arr[2]);
        accessLog.setUrl(arr[3]);
        accessLog.setReferrer(arr[4]);
        accessLog.setPageName(arr[5] );
        accessLog.setPageOnlyId(arr[6]);
        accessLog.setBadTime(arr[7]);
        accessLog.setFirstScreenTime(arr[8]);
        accessLog.setOperationTime(arr[9]);
        accessLog.setTotalTime(arr[10]);
        accessLog.setScriptError(arr[11]);
        accessLog.setPeriodTime(arr[12]);
        accessLog.setPv(arr[13]);
        accessLog.setUv(arr[14]);
        accessLog.setClickTime(arr[15]);
        accessLog.setElement(arr[16]);
        accessLog.setElementContext(arr[17]);
        accessLog.setElementId(arr[18]);
        accessLog.setElementName(arr[19]);
        accessLog.setElementCustom(arr[20]);
        accessLog.setElementOffset(arr[21]);
        accessLog.setElementFatherTag(arr[22]);
        accessLog.setDnsTime(arr[23]);
        accessLog.setLeaveTime(arr[24]);
        accessLog.setUserLogin(arr[25]);
        accessLog.setBrowserType(arr[26]);
        accessLog.setBrowserType(arr[27]);
        accessLog.setBrowserVersion(arr[28]);
        accessLog.setBrowserEnvironment(arr[29]);
        accessLog.setScreen(arr[30]);

        return accessLog;
    }

    private void getScriptError(){

    }
}
