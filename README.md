# backend_csdn
一个简单的springboot前后端交互demo，目前只写了页面跳转和简单的登录功能，有时间再来优化具体页面内容和数据库。<br>
数据库（springboot_backend）目前只有一张表（user）：<br>
/*<br>
Navicat MySQL Data Transfer<br>
<br>
Source Server         : mysql_db<br>
Source Server Version : 50721<br>
Source Host           : localhost:3306<br>
Source Database       : springboot_backend<br>
<br>
Target Server Type    : MYSQL<br>
Target Server Version : 50721<br>
File Encoding         : 65001<br>
<br>
Date: 2018-11-30 21:39:47<br>
*/<br>
<br>
SET FOREIGN_KEY_CHECKS=0;<br>
<br>
-- ----------------------------<br>
-- Table structure for user<br>
-- ----------------------------<br>
DROP TABLE IF EXISTS `user`;<br>
CREATE TABLE `user` (<br>
  `id` int(11) NOT NULL AUTO_INCREMENT,<br>
  `username` varchar(255) NOT NULL,<br>
  `password` varchar(255) NOT NULL,<br>
  PRIMARY KEY (`id`)<br>
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;<br>
<br>
-- ----------------------------<br>
-- Records of user<br>
-- ----------------------------<br>
INSERT INTO `user` VALUES ('1', 'admin', 'admin');<br>
