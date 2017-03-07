# Host: 127.0.0.1  (Version 5.7.17-log)
# Date: 2017-03-07 19:40:28
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
