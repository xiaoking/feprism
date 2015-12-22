package com.feprism.service;

import com.feprism.entity.AccessLog;

import java.net.UnknownHostException;

/**
 * Created by mac on 15/12/22.
 */
public interface AccessLogService {

    void save(AccessLog accessLog) throws UnknownHostException;
    String getIp(String domain) throws UnknownHostException;
}
