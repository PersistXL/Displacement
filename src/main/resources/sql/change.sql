/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : change

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-11-02 17:28:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `sex` varchar(2) NOT NULL,
  `age` int(100) NOT NULL,
  `job` varchar(255) NOT NULL,
  `post_message` varchar(255) DEFAULT NULL,
  `order_situation` varchar(255) DEFAULT NULL,
  `id_card` varchar(18) NOT NULL,
  `phone` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of information
-- ----------------------------

-- ----------------------------
-- Table structure for jobs
-- ----------------------------
DROP TABLE IF EXISTS `jobs`;
CREATE TABLE `jobs` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `teacher` varchar(255) NOT NULL COMMENT '教师',
  `driver` varchar(255) NOT NULL COMMENT '司机',
  `coach` varchar(255) NOT NULL COMMENT '教练员',
  `cashier` varchar(255) NOT NULL COMMENT '收营员',
  `waiter` varchar(255) NOT NULL COMMENT '服务员',
  `nurse` varchar(255) NOT NULL COMMENT '保姆',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jobs
-- ----------------------------

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `f_id` int(11) NOT NULL,
  `j_id` int(11) NOT NULL,
  `date` varchar(255) NOT NULL,
  `matter` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `age` int(100) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `id_card` varchar(18) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'root', 'root', null, null, null, '', '', null);
INSERT INTO `userinfo` VALUES ('2', 'lisi', '123456', null, null, null, '', '', null);
INSERT INTO `userinfo` VALUES ('3', '张三', '123456798', '男', '20', '教师', '612726199502057815', '15709181869', null);
INSERT INTO `userinfo` VALUES ('4', '王五', '123456', '男', '20', '司机', '612726195505021457', '15709081201', null);
INSERT INTO `userinfo` VALUES ('5', '赵六', '123456', '男', '15', '', '', '', null);
