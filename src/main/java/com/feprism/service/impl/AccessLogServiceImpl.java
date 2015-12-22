package com.feprism.service.impl;

import com.feprism.entity.AccessLog;
import com.feprism.service.AccessLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by mac on 15/12/22.
 */
@Service
public class AccessLogServiceImpl implements AccessLogService {

    private Logger logger = LoggerFactory.getLogger(AccessLogServiceImpl.class);
    private Logger log = LoggerFactory.getLogger("accessLogAppender");

    public void save(AccessLog accessLog) throws UnknownHostException {

        //保存ip
        accessLog.setIp(this.getIp(accessLog.getDomain() ) );

        log.info(accessLog.toString() );
    }

    private String getIp(String domain) throws UnknownHostException {
        String ip="";

        if(!domain.isEmpty() ){
            InetAddress address = InetAddress.getByName(domain);
            ip = address.getHostAddress();
        }

        return ip;
    }
}
