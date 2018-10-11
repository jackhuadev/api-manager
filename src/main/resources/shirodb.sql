/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : shirodb

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-10-11 17:46:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE "permission" (
  "id" int(11) NOT NULL AUTO_INCREMENT,
  "pname" varchar(20) DEFAULT NULL,
  "ptype" int(11) DEFAULT NULL COMMENT '权限类型',
  "created" datetime DEFAULT NULL,
  "updated" datetime DEFAULT NULL,
  PRIMARY KEY ("id")
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE "role" (
  "id" int(11) NOT NULL AUTO_INCREMENT,
  "rname" varchar(20) DEFAULT NULL COMMENT '角色名称',
  "rdesc" varchar(20) DEFAULT NULL COMMENT '角色描述',
  "created" datetime DEFAULT NULL,
  "updated" datetime DEFAULT NULL,
  PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin', '超级管理员', '2018-10-11 14:48:30', '2018-10-11 14:48:33');
INSERT INTO `role` VALUES ('2', 'normal', '普通用户', '2018-10-11 14:49:08', '2018-10-11 14:49:11');
INSERT INTO `role` VALUES ('3', 'api', 'api调用者', '2018-10-11 14:50:09', '2018-10-11 14:50:12');

-- ----------------------------
-- Table structure for `role_permission_relation`
-- ----------------------------
DROP TABLE IF EXISTS `role_permission_relation`;
CREATE TABLE "role_permission_relation" (
  "id" int(11) NOT NULL AUTO_INCREMENT,
  "rid" int(11) NOT NULL,
  "pid" int(11) NOT NULL,
  PRIMARY KEY ("id"),
  KEY "role_perm_r" ("rid"),
  KEY "role_perm_p" ("pid"),
  CONSTRAINT "role_perm_p" FOREIGN KEY ("pid") REFERENCES "permission" ("id"),
  CONSTRAINT "role_perm_r" FOREIGN KEY ("rid") REFERENCES "role" ("id")
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission_relation
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE "user" (
  "id" int(16) NOT NULL AUTO_INCREMENT,
  "name" varchar(50) NOT NULL,
  "age" int(11) DEFAULT NULL,
  "desc" varchar(100) DEFAULT NULL,
  "height" double DEFAULT NULL,
  "nick" varchar(50) DEFAULT NULL,
  "password" varchar(50) DEFAULT NULL COMMENT '加密后的登录密码',
  "salt" varchar(20) DEFAULT NULL COMMENT '盐',
  "created" datetime DEFAULT NULL,
  "updated" datetime DEFAULT NULL,
  PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '3', '{\"province\":\"sichuan\",\"city\":\"chengdu\"}', '312', null, null, null, null, null);

-- ----------------------------
-- Table structure for `user_role_relation`
-- ----------------------------
DROP TABLE IF EXISTS `user_role_relation`;
CREATE TABLE "user_role_relation" (
  "id" int(11) NOT NULL AUTO_INCREMENT,
  "rid" int(11) DEFAULT NULL COMMENT '角色id',
  "uid" int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY ("id"),
  KEY "user_role_r" ("rid"),
  KEY "user_role_u" ("uid"),
  CONSTRAINT "user_role_r" FOREIGN KEY ("rid") REFERENCES "role" ("id"),
  CONSTRAINT "user_role_u" FOREIGN KEY ("uid") REFERENCES "user" ("id")
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role_relation
-- ----------------------------
