# Crayler 的云盘

基于 Hadoop 使用 Java 开发一个云盘系统是一个具有挑战性且有趣的项目。

这个系统可以利用 Hadoop 的分布式存储和处理能力来提供高效和可扩展的存储服务。

## 系统设计概述

核心功能模块：

- 用户管理：注册、登录、权限控制等。
- 文件管理：文件上传、下载、删除、重命名、目录管理等。
- 存储管理：使用 Hadoop HDFS 提供分布式文件存储功能。
- 元数据管理：管理文件及用户的元信息（存储在关系型数据库如 MySQL）。
- 日志与监控：记录用户操作日志，监控存储系统运行状态。
- 扩展功能：支持文件版本控制、分享链接生成、文件搜索等。

## 技术栈

- Spring Boot
- Spring Security
- Spring Data JPA
- Spring Thymeleaf
- Hadoop HDFS
- MySQL
- Maven
- Tailwind CSS

## 系统模块

- 用户模块：用户注册、登录、权限控制等。
- 文件模块：文件上传、下载、删除、重命名、目录管理等。
- 存储模块：使用 Hadoop HDFS 提供分布式文件存储功能。
- 元数据模块：管理文件及用户的元信息（存储在关系型数据库如 MySQL）。
- 日志与监控模块：记录用户操作日志，监控存储系统运行状态。
- 扩展模块：支持文件版本控制、分享链接生成、文件搜索等。

## 开发环境

- JDK 17
- VSCode
- Hadoop HDFS API
- MySQL 8.0.30

## 默认账号密码

- admin/admin
- user/user

## 感谢

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Security](https://spring.io/projects/spring-security)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring Thymeleaf](https://www.thymeleaf.org/)
- [Hadoop HDFS](https://hadoop.apache.org/)
- [MySQL](https://www.mysql.com/)
- [Maven](https://maven.apache.org/)
- [Tailwind CSS](https://tailwindcss.com/)
