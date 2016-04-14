package com.feprism.action;

import com.feprism.dao.WebPageMapper;
import com.feprism.entity.WebPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mac on 15/12/28.
 */
@Controller
public class TestAction {
    /*@Autowired
    private WebPageMapper webPageMapper;*/

    @RequestMapping(value = "/test")
    public String getWebPageById(@RequestParam Integer id){
        //WebPage webPage = webPageMapper.selectByPrimaryKey(id );
        System.out.println( "成功" );
        return "";
    }
}
