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

 Date: 26/03/2020 16:33:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sp_type
-- ----------------------------
DROP TABLE IF EXISTS `sp_type`;
CREATE TABLE `sp_type`  (
  `type_id` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `type_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型名称',
  `delete_time` int(11) NULL DEFAULT NULL COMMENT '删除时间标志',
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '类型表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sp_type
-- ----------------------------
INSERT INTO `sp_type` VALUES (1, '精品手机', 1);
INSERT INTO `sp_type` VALUES (2, '书本', 2);
INSERT INTO `sp_type` VALUES (3, '电脑', 3);
INSERT INTO `sp_type` VALUES (4, '电影', NULL);

SET FOREIGN_KEY_CHECKS = 1;
