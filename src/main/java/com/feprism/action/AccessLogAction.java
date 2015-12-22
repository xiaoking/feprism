package com.feprism.action;

import com.feprism.entity.AccessLog;
import com.feprism.service.AccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.BASE64Encoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * Created by mac on 15/12/22.
 */
@Controller
public class AccessLogAction {

    @Autowired
    private AccessLogService accessLogService;

    @RequestMapping(value = "/*_fe.gif")
    public void accessLog(HttpServletRequest request,HttpServletResponse response,AccessLog accessLog) throws UnknownHostException, NoSuchAlgorithmException, UnsupportedEncodingException {

        this.accessLogService.save(accessLog);

        Cookie[] cookies = request.getCookies();
        String cookieName = "__ubt_fe";
        Boolean isCookies = false;

        if(cookies!=null){
            for(int i=0;i<cookies.length;i++ ){
                Cookie cookie = cookies[i];

                if(cookie.getName().equals(cookieName ) ){
                    isCookies = true;
                    //accessLog.setUv(0);
                }

            }
        }

        //设置cookie
        if(!isCookies ){

            MessageDigest md5 = MessageDigest.getInstance("MD5");
            String str = new Date().getTime()+accessLogService.getIp(accessLog.getDomain() );

            Cookie c = new Cookie(cookieName,new BASE64Encoder().encode(md5.digest(str.getBytes("utf-8") )  ) );

            c.setPath("/");
            //c.setMaxAge(0);
            response.addCookie(c);
        }

        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.addHeader( "Cache-Control", "no-cache" );
        response.addHeader( "Cache-Control", "no-store" );
        response.addHeader( "Cache-Control", "must-revalidate" );
        response.setContentType("image/gif");
    }
}
