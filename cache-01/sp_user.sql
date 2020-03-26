/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云zcm
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : 101.200.91.110:3306
 Source Schema         : mydb

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 26/03/2020 16:33:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sp_user
-- ----------------------------
DROP TABLE IF EXISTS `sp_user`;
CREATE TABLE `sp_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `username` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '登录名',
  `qq_open_id` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'qq官方唯一编号信息',
  `password` char(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '登录密码',
  `user_email` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '邮箱',
  `user_email_code` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新用户注册邮件激活唯一校验码',
  `is_active` enum('是','否') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '否' COMMENT '新用户是否已经通过邮箱激活帐号',
  `user_sex` enum('保密','女','男') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '男' COMMENT '性别',
  `user_qq` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'qq',
  `user_tel` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '手机',
  `user_xueli` enum('博士','硕士','本科','专科','高中','初中','小学') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '本科' COMMENT '学历',
  `user_hobby` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '爱好',
  `user_introduce` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '简介',
  `create_time` int(11) NOT NULL COMMENT '创建时间',
  `update_time` int(11) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_user
-- ----------------------------
INSERT INTO `sp_user` VALUES (1, 'zce', NULL, '$2a$08$lV0Gr4AKx7xH7cCU4KCGCOikNzGPaWIpw9W7A9BONIxoJ2.hGC9qi', 'w@zce.me', '1242d9b5', '否', '男', '', '', '本科', '', NULL, 1512033129, 1512033129);
INSERT INTO `sp_user` VALUES (11, 'ww', NULL, '$2a$08$09nUxs.9czzXc4JZJTOdteeXSd/mxZVg96AhqciGbTMB6cfbGUWC2', 'i@zce.me', 'f9a9d0cc', '是', '女', '1231231211', '12313211', '博士', '123123', '123123123', 1512122098, 1512122098);

SET FOREIGN_KEY_CHECKS = 1;
