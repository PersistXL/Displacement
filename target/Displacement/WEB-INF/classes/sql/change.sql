/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : change

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-11-16 20:41:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `f_id` int(11) DEFAULT NULL,
  `j_id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `matter` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', null, null, '4155646', '456153', null, '486518', '48616165');
INSERT INTO `message` VALUES ('2', null, null, 'dfasdf', 'sdfasdf', null, 'sdfasdf', 'asdfa');
INSERT INTO `message` VALUES ('3', null, null, '李四', '551126057@qq.com', null, '15709181869', '星期三下午第一节课，在西安欧亚学院连体楼上课。');
INSERT INTO `message` VALUES ('4', null, null, 'root', 'root@qq.com', null, '13444445555', '我们的大家挺');
INSERT INTO `message` VALUES ('5', null, null, '法饿饭', '额发生的', null, '罚恶法', ' 饿啊额哇');
INSERT INTO `message` VALUES ('6', null, null, 'sdfazxcdsczxc', 'zxcasdfafcasczcas@qq.com', null, '123456789', 'asdfasdfasdfasdfa');
INSERT INTO `message` VALUES ('7', null, null, 'sdfazxcdsczxc', 'zxcasdfafcasczcas@qq.com', null, '123456789', 'asdfasdfasdfasdfa');
INSERT INTO `message` VALUES ('8', null, null, 'sdfazxcdsczxc', 'zxcasdfafcasczcas@qq.com', null, '123456789', 'asdfasdfasdfasdfa');
INSERT INTO `message` VALUES ('9', null, null, 'sdfazxcdsczxc', 'zxcasdfafcasczcas@qq.com', null, '123456789', 'asdfasdfasdfasdfa');
INSERT INTO `message` VALUES ('10', null, null, 'sdfazxcdsczxc', 'zxcasdfafcasczcas@qq.com', null, '123456789', 'asdfasdfasdfasdfa');
INSERT INTO `message` VALUES ('11', null, null, 'sdfazxcdsczxc', 'zxcasdfafcasczcas@qq.com', null, '123456789', 'asdfasdfasdfasdfa');
INSERT INTO `message` VALUES ('12', null, null, 'fasd', 'asdfa', null, 'sdfa', 'asdfa');
INSERT INTO `message` VALUES ('13', null, null, 'Name', 'Email', null, 'Phone', 'Comments');
INSERT INTO `message` VALUES ('14', null, null, '王二小', '123456789@qq.com', null, '13455556666', '在下周三的下午一点钟，在连门星城需要检查宿舍');

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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'root', 'root', null, null, null, '', '', null);
INSERT INTO `userinfo` VALUES ('2', 'lisi', '123456', null, null, null, '', '', null);
INSERT INTO `userinfo` VALUES ('3', '张三', '123456798', '男', '20', '教师', '612726199502057815', '15709181869', null);
INSERT INTO `userinfo` VALUES ('4', '王五', '123456', '男', '20', '司机', '612726195505021457', '15709081201', null);
INSERT INTO `userinfo` VALUES ('5', '赵六', '123456', '男', '15', '服务员', '612726199502057815', '13444443333', null);
INSERT INTO `userinfo` VALUES ('6', '123', '123', '男', '20', '清洁工', '612426199805021548', '13265478965', null);
INSERT INTO `userinfo` VALUES ('7', 'persistxl', 'wasd0824..', '男', '19', '教师', '612726199502057815', '15709181869', null);
INSERT INTO `userinfo` VALUES ('8', 'pointing', '123456', '女', '20', '司机', '612726195505021457', '13253352525', null);
INSERT INTO `userinfo` VALUES ('9', 'point', '123456', '女', '21', '幼师', '612726195505021321', '13253352524', null);
INSERT INTO `userinfo` VALUES ('10', '123', '123', '男', '25', '清洁工', '612426199805021548', '13265478965', null);
INSERT INTO `userinfo` VALUES ('11', '123', '456', '男', '25', '教师', '612426199805021548', '13265478965', null);
INSERT INTO `userinfo` VALUES ('12', '123', '456', '男', '25', '清洁工', '612426199805021548', '13265478965', null);
