package com.feprism.pojo;

import java.io.Serializable;

/**
 * Created by mac on 15/12/22.
 */
public class AccessLog implements Serializable {

    //网页ip
    private String ip;
    //网页url
    private String url;
    //domain
    private String domain;
    //网页来源
    private String referrer;
    //网页名称
    private String pageName;
    //页面唯一标识
    private String pageOnlyId;

    //白屏时间
    private String badTime;
    //第一屏时间
    private String firstScreenTime;
    //用户可以操作时间
    private String operationTime;
    //页面总加载时间
    private  String totalTime;
    //脚本异常
    private String scriptError;
    //访问时间段
    private String periodTime;

    //浏览器类型
    private String browserType;
    //浏览器版本
    private String browserVersion;
    //浏览器环境
    private String browserEnvironment;
    //分辨率
    private String screen;
    //访客标识

    //pv
    private String pv;
    //uv
    private String uv;

    //点击时间
    private String clickTime;
    //点击的元素
    private String element;
    //点击的元素的内容
    private String elementContext;
    //点击的元素id
    private String elementId;
    //点击的元素唯一标识
    private String elementName;
    //点击的元素自定义值
    private String elementCustom;
    //点击的元素的x,y坐标
    private String elementOffset;
    //点击的元素的父标签
    private String elementFatherTag;

    //用户离开时间
    private String leaveTime;
    //用户是否登陆
    private String userLogin;

    //dns解析时间
    private String dnsTime;



    public void AccessLog(){

    }

    public void AccessLog(String ip,String domain,String url,String referrer, String pageName, String pageOnlyId,
                          String badTime, String firstScreenTime,String operationTime, String totalTime, String scriptError, String periodTime,
                          String browserType, String browserVersion, String browserEnvironment, String screen,
                          String pv, String uv,
                          String clickTime, String element, String elementContext, String elementId, String elementName, String elementCustom, String elementOffset, String elementFatherTag,
                          String dns,String leaveTime,
                          String userLogin){

        this.setIp(ip);
        this.setDomain(domain);
        this.setUrl(url);
        this.setReferrer(referrer);
        this.setPageName(pageName);
        this.setPageOnlyId(pageOnlyId);

        this.setBadTime(badTime);
        this.setFirstScreenTime(firstScreenTime);
        this.setOperationTime(operationTime);
        this.setTotalTime(totalTime);
        this.setScriptError(scriptError);
        this.setPeriodTime(periodTime);

        this.setBrowserType(browserType);
        this.setBrowserVersion(browserVersion);
        this.setBrowserEnvironment(browserEnvironment);
        this.setScreen(screen);

        this.setPv(pv);
        this.setUv(uv);

        this.setClickTime(clickTime);
        this.setElement(element);
        this.setElementContext(elementContext);
        this.setElementId(elementId);
        this.setElementName(elementName);
        this.setElementCustom(elementCustom);
        this.setElementOffset(elementOffset);
        this.setElementFatherTag(elementFatherTag);

        this.setDnsTime(dns);
        this.setLeaveTime(leaveTime);
        this.setUserLogin(userLogin);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url.isEmpty() ? "":url;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageOnlyId() {
        return pageOnlyId;
    }

    public void setPageOnlyId(String pageOnlyId) {
        this.pageOnlyId = pageOnlyId;
    }

    public String getBadTime() {
        return badTime;
    }

    public void setBadTime(String badTime) {
        this.badTime = badTime;
    }

    public String getFirstScreenTime() {
        return firstScreenTime;
    }

    public void setFirstScreenTime(String firstScreenTime) {
        this.firstScreenTime = firstScreenTime;
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getScriptError() {
        return scriptError;
    }

    public void setScriptError(String scriptError) {
        this.scriptError = scriptError;
    }

    public String getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(String periodTime) {
        this.periodTime = periodTime;
    }

    public String getBrowserType() {
        return browserType;
    }

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public String getBrowserEnvironment() {
        return browserEnvironment;
    }

    public void setBrowserEnvironment(String browserEnvironment) {
        this.browserEnvironment = browserEnvironment;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public String getClickTime() {
        return clickTime;
    }

    public void setClickTime(String clickTime) {
        this.clickTime = clickTime;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getElementContext() {
        return elementContext;
    }

    public void setElementContext(String elementContext) {
        this.elementContext = elementContext;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getElementCustom() {
        return elementCustom;
    }

    public void setElementCustom(String elementCustom) {
        this.elementCustom = elementCustom;
    }

    public String getElementOffset() {
        return elementOffset;
    }

    public void setElementOffset(String elementOffset) {
        this.elementOffset = elementOffset;
    }

    public String getElementFatherTag() {
        return elementFatherTag;
    }

    public void setElementFatherTag(String elementFatherTag) {
        this.elementFatherTag = elementFatherTag;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getDnsTime() {
        return dnsTime;
    }

    public void setDnsTime(String dnsTime) {
        this.dnsTime = dnsTime;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer();
        String split = LogTask.getLogSpliter();

        buffer.append(LogTask.getLogPrefix() ).append(split).append(this.getIp()).append(split)
            .append(this.getDomain() ).append(split)
            .append(this.getUrl()).append(split)
            .append(this.getReferrer()).append(split)
            .append(this.getPageName() ).append(split)
            .append(this.getPageOnlyId() ).append(split)
            .append(this.getBadTime() ).append(split)
            .append(this.getFirstScreenTime() ).append(split)
            .append(this.getOperationTime()).append(split)
            .append(this.getTotalTime()).append(split)
            .append(this.getScriptError()).append(split)
            .append(this.getPeriodTime()).append(split)
            .append(this.getPv()).append(split)
            .append(this.getUv()).append(split)
            .append(this.getClickTime()).append(split)
            .append(this.getElement()).append(split)
            .append(this.getElementContext()).append(split)
            .append(this.getElementId()).append(split)
            .append(this.getElementName()).append(split)
            .append(this.getElementCustom()).append(split)
            .append(this.getElementOffset()).append(split)
            .append(this.getElementFatherTag()).append(split)
            .append(this.getDnsTime()).append(split)
            .append(this.getLeaveTime()).append(split)
            .append(this.getUserLogin()).append(split)
            .append(this.getBrowserType()).append(split)
            .append(this.getBrowserVersion()).append(split)
            .append(this.getBrowserEnvironment()).append(split)
            .append(this.getScreen());

        return buffer.toString();
    }
}
