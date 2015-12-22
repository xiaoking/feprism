package com.feprism.action;

import com.feprism.entity.AccessLog;
import com.feprism.service.AccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.UnknownHostException;

/**
 * Created by mac on 15/12/22.
 */
@Controller
public class AccessLogAction {

    @Autowired
    private AccessLogService accessLogService;

    @RequestMapping(value = "/*_fe.gif")
    public void accessLog(HttpServletRequest request,HttpServletResponse response,AccessLog accessLog) throws UnknownHostException {

        this.accessLogService.save(accessLog);

        //设置cookie

        response.setContentType("image/gif");
    }
}
