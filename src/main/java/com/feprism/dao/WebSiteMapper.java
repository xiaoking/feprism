package com.feprism.dao;

import com.feprism.entity.WebSite;

public interface WebSiteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fe_web_site
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fe_web_site
     *
     * @mbggenerated
     */
    int insert(WebSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fe_web_site
     *
     * @mbggenerated
     */
    int insertSelective(WebSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fe_web_site
     *
     * @mbggenerated
     */
    WebSite selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fe_web_site
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WebSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fe_web_site
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WebSite record);
}