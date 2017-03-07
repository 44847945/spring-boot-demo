# Host: 127.0.0.1  (Version 5.7.17-log)
# Date: 2017-03-07 20:47:01
# Generator: MySQL-Front 6.0  (Build 1.37)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "city"
#

DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `city_id` int(11) NOT NULL COMMENT '自增长,作为表主键',
  `province_id` int(11) NOT NULL COMMENT '省份ID',
  `city_name` varchar(20) NOT NULL COMMENT '城市名称',
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='城市表';

#
# Data for table "city"
#

INSERT INTO `city` VALUES (1,10,'北京'),(2,11,'天津');

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户ID,唯一性',
  `user_password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'demo1@test.com','21232f297a57a5a743894a0e4a801fc3');
