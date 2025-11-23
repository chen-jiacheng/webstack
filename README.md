# WebStack

## 项目简介
WebStack 是一个基于 Java 的 Web技术栈项目。

## 主要特性
- 响应式页面设计
- 后台管理系统

## 技术栈
- Java Spring Boot
- MySQL 数据库
- Thymeleaf 模板引擎
- Bootstrap 前端框架

## 快速开始

### 环境要求
- JDK 8+
- Maven 3.6+
- MySQL 5.7+

### 安装步骤
1. 克隆项目到本地
2. 创建数据库并执行初始化脚本
3. 修改 `application.yml` 中的数据库配置
4. 使用 Maven 构建项目：
   ```bash
   mvn clean install
   ```

5. 运行项目：
   ```bash
   mvn spring-boot:run
   ```


## 配置说明
主要配置文件位于 `src/main/resources/application.yml`

## 访问地址
- 前台页面：http://localhost:8080
- 后台管理：http://localhost:8080/admin

## 开发指南
- 控制器层：`controller` 包
- 服务层：`service` 包
- 数据访问层：`repository` 包
- 实体类：`entity` 包