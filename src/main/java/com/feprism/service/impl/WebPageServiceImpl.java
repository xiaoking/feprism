package com.feprism.service.impl;

import com.feprism.dao.WebPageMapper;
import com.feprism.entity.PageInfo;
import com.feprism.service.WebPageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by mac on 15/12/28.
 */
public class WebPageServiceImpl implements WebPageService {

    @Autowired
    private WebPageMapper webPageMapper;

    public WebPageMapper getWebPageMapper() {
        return webPageMapper;
    }

    public void setWebPageMapper(WebPageMapper webPageMapper) {
        this.webPageMapper = webPageMapper;
    }

    @Override
    public Map<String, Object> getWebPage(String primaryKey) {
        //List<PageInfo> pageInfoList =  this.webPageMapper.selectByPrimaryKey(Integer.parseInt(primaryKey) );
        return null;
    }
}
