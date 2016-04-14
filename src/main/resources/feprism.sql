/**database*/
DROP DATABASE IF EXISTS `feprism`;

CREATE DATABASE feprism DEFAULT CHARSET = utf8;

USE feprism;

/**用户信息表*/
DROP  TABLE IF EXISTS `fe_user`;

CREATE TABLE `fe_user`(
  `id` INT(10) not null AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  `username` VARCHAR(50) NOT NULL COMMENT '用户名',
  `password` VARCHAR(100) NOT NULL COMMENT '密码',
  `company` VARCHAR(50) NOT NULL COMMENT '所属公司',
  `email` VARCHAR(50) NOT NULL COMMENT '公司邮箱',
  `department` VARCHAR(50) DEFAULT '' COMMENT '公司职位',
  `role` VARCHAR(50) DEFAULT '' COMMENT '公司角色',
  `web_site_id` INT NOT NULL COMMENT '网站基本信息',
  `permission_id` INT NOT NULL COMMENT '权限',
  `name` VARCHAR(50) DEFAULT '' COMMENT '姓名',
  `sex` tinyint(5) DEFAULT 0 COMMENT '性别',
  `birthday` VARCHAR(50) DEFAULT '' COMMENT '生日',
  `card` VARCHAR(100) DEFAULT '' COMMENT '身份证',
  `phone` VARCHAR(50) DEFAULT '' COMMENT '联系电话',
  `add_time` TIMESTAMP DEFAULT current_timestamp COMMENT '添加时间',
  INDEX(id,web_site_id,permission_id)/*,
  FOREIGN KEY(web_site_id) REFERENCES fe_web_site(id),
  FOREIGN KEY(permission_id) REFERENCES fe_permissions(id)*/
) ENGINE =MyISAM DEFAULT CHARSET = utf8 COMMENT '用户信息表';

/**权限*/
DROP  TABLE IF EXISTS `fe_permissions`;

CREATE TABLE `fe_permissions`(
  `id` INT(10) NOT NULL  AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  `name` VARCHAR(50) NOT NULL COMMENT '权限',
  `info` VARCHAR(200) DEFAULT '' COMMENT '描述',
  `add_time` TIMESTAMP DEFAULT current_timestamp COMMENT '添加时间',
  INDEX (id)
) ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '用户权限表';

/**网站基础信息表*/
DROP TABLE IF EXISTS `fe_web_site`;

CREATE TABLE `fe_web_site`(
  `id` INT(10) NOT NULL  AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  `web_name` VARCHAR(50) NOT NULL COMMENT '网站名称',
  `web_url` VARCHAR(200) DEFAULT '' COMMENT '网站地址',
  `web_domain` VARCHAR(50) DEFAULT '' COMMENT 'domian',
  `ip` VARCHAR(50) DEFAULT '' COMMENT 'ip',
  `primary_key` INT NOT NULL COMMENT '唯一标识',
  `add_time` TIMESTAMP DEFAULT current_timestamp COMMENT '添加时间',
  INDEX (id,primary_key)
)  ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '网站基础信息表';

/**页面信息表*/
DROP TABLE IF EXISTS `fe_web_page`;

CREATE TABLE `fe_web_page`(
  `id` INT(10) NOT NULL  AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  `web_name` VARCHAR(50) NOT NULL COMMENT '页面名称',
  `web_url` VARCHAR(200) DEFAULT '' COMMENT '页面请求地址',
  `page_id` VARCHAR(50) DEFAULT ''  COMMENT '页面唯一id',
  `pv` INT(10) DEFAULT 0 COMMENT '访问次数',
  `uv` INT(10) DEFAULT 0 COMMENT '独立ip访问次数',
  `web_site_id` INT NOT NULL COMMENT '所属网站',
  `add_time` TIMESTAMP DEFAULT current_timestamp COMMENT '添加时间',
  INDEX (id)/*,
  FOREIGN KEY (web_site_id) REFERENCES fe_web_site(id)*/
)  ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '页面信息表';

/**页面基本信息表*/
DROP TABLE IF EXISTS `fe_web_page_info`;

CREATE TABLE `fe_web_page_info`(
  `id` INT(10) NOT NULL  AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  `pv` INT(10) DEFAULT 0 COMMENT '访问次数',
  `uv` INT(10) DEFAULT 0 COMMENT '独立ip访问次数',
  `browser_version` VARCHAR(50) DEFAULT '' COMMENT '浏览器版本',
  `browser_type` VARCHAR(50) DEFAULT '' COMMENT '浏览器类型',
  `browser_environment` VARCHAR(50) DEFAULT '' COMMENT '浏览器环境',
  `device_resolution` VARCHAR(50) DEFAULT '' COMMENT '设备分辨率',
  `period_time` VARCHAR(50) DEFAULT '' COMMENT '访问时间段',
  `leave_time` VARCHAR(50) DEFAULT '' COMMENT '离开时间',
  `dns_time` VARCHAR(50) DEFAULT '' COMMENT 'dns解析时间',
  `bad_time` VARCHAR(50) DEFAULT '' COMMENT '白屏时间',
  `first_screen_time` VARCHAR(50) DEFAULT '' COMMENT '首屏加载时间',
  `operation_time` VARCHAR(50) DEFAULT '' COMMENT '用户可操作时间',
  `total_time` VARCHAR(50) DEFAULT '' COMMENT '页面总加载时间',
  `web_page_id` INT NOT NULL COMMENT '所属网页',
  `referrer` VARCHAR(100) DEFAULT '' COMMENT '来源',
  `add_time` TIMESTAMP DEFAULT current_timestamp COMMENT '添加时间',
  INDEX (id,web_page_id)/*,
  FOREIGN KEY(web_page_id) REFERENCES fe_web_page(id)*/
)  ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '页面基本信息表';

/**页面元素信息表*/
DROP TABLE IF EXISTS `fe_web_element`;

CREATE TABLE `fe_web_element`(
  `id` INT(10) NOT NULL  AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  `name` VARCHAR(50) NOT NULL COMMENT '名称',
  `url` VARCHAR(100) DEFAULT '' COMMENT 'url',
  `element_id` VARCHAR(200) DEFAULT '' COMMENT '元素id',
  `content` TEXT COMMENT '内容',
  `position` VARCHAR(50) DEFAULT '' COMMENT '坐标',
  `father_element` VARCHAR(100) DEFAULT '' COMMENT '父节点信息',
  `custom_info` VARCHAR(200) DEFAULT '' COMMENT '父节点信息',
  `click_time` VARCHAR(50) DEFAULT '' COMMENT '被点击时间',
  `click_num` VARCHAR(50) DEFAULT '' COMMENT '被点击次数',
  `web_page_id` INT NOT NULL COMMENT '所属网页',
  `add_time` TIMESTAMP DEFAULT current_timestamp COMMENT '添加时间',
  INDEX (id,web_page_id)/*,
  FOREIGN KEY(web_page_id) REFERENCES fe_web_page(id)*/
)  ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '页面元素信息表';

/**脚本报错信息表*/
DROP TABLE IF EXISTS `fe_script_info`;

CREATE TABLE `fe_script_info`(
  `id` INT(10) NOT NULL  AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  `name` VARCHAR(50) DEFAULT '' COMMENT '名称',
  `info` TEXT  COMMENT '信息',
  `url` VARCHAR(100) DEFAULT '' COMMENT 'url',
  `user_agent` VARCHAR(100) DEFAULT '' COMMENT 'url',
  `web_page_id` INT NOT NULL COMMENT '所属网页',
  `error_time` VARCHAR(50) DEFAULT '' COMMENT '错误记录时间',
  `add_time` TIMESTAMP DEFAULT current_timestamp COMMENT '添加时间',
  INDEX (id,web_page_id)/*,
  FOREIGN KEY(web_page_id) REFERENCES fe_web_page(id)*/
)  ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '脚本报错信息表';