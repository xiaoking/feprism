package com.feprism.entity;

import java.util.Date;

public class WebSite {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fe_web_site.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fe_web_site.web_name
     *
     * @mbggenerated
     */
    private String webName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fe_web_site.web_url
     *
     * @mbggenerated
     */
    private String webUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fe_web_site.web_domain
     *
     * @mbggenerated
     */
    private String webDomain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fe_web_site.ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fe_web_site.primary_key
     *
     * @mbggenerated
     */
    private Integer primaryKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fe_web_site.add_time
     *
     * @mbggenerated
     */
    private Date addTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fe_web_site
     *
     * @mbggenerated
     */
    public WebSite(Integer id, String webName, String webUrl, String webDomain, String ip, Integer primaryKey, Date addTime) {
        this.id = id;
        this.webName = webName;
        this.webUrl = webUrl;
        this.webDomain = webDomain;
        this.ip = ip;
        this.primaryKey = primaryKey;
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fe_web_site
     *
     * @mbggenerated
     */
    public WebSite() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fe_web_site.id
     *
     * @return the value of fe_web_site.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fe_web_site.id
     *
     * @param id the value for fe_web_site.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fe_web_site.web_name
     *
     * @return the value of fe_web_site.web_name
     *
     * @mbggenerated
     */
    public String getWebName() {
        return webName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fe_web_site.web_name
     *
     * @param webName the value for fe_web_site.web_name
     *
     * @mbggenerated
     */
    public void setWebName(String webName) {
        this.webName = webName == null ? null : webName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fe_web_site.web_url
     *
     * @return the value of fe_web_site.web_url
     *
     * @mbggenerated
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fe_web_site.web_url
     *
     * @param webUrl the value for fe_web_site.web_url
     *
     * @mbggenerated
     */
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl == null ? null : webUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fe_web_site.web_domain
     *
     * @return the value of fe_web_site.web_domain
     *
     * @mbggenerated
     */
    public String getWebDomain() {
        return webDomain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fe_web_site.web_domain
     *
     * @param webDomain the value for fe_web_site.web_domain
     *
     * @mbggenerated
     */
    public void setWebDomain(String webDomain) {
        this.webDomain = webDomain == null ? null : webDomain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fe_web_site.ip
     *
     * @return the value of fe_web_site.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fe_web_site.ip
     *
     * @param ip the value for fe_web_site.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fe_web_site.primary_key
     *
     * @return the value of fe_web_site.primary_key
     *
     * @mbggenerated
     */
    public Integer getPrimaryKey() {
        return primaryKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fe_web_site.primary_key
     *
     * @param primaryKey the value for fe_web_site.primary_key
     *
     * @mbggenerated
     */
    public void setPrimaryKey(Integer primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fe_web_site.add_time
     *
     * @return the value of fe_web_site.add_time
     *
     * @mbggenerated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fe_web_site.add_time
     *
     * @param addTime the value for fe_web_site.add_time
     *
     * @mbggenerated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}