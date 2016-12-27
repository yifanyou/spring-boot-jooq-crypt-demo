# 简要说明
Spring boot + JOOQ + THYMELEAF 一个简单的CRUD展示

* 利用JOOQ的Converter实现了对数据库字段的加解密功能
* 利用JOOQ的ExecuteListner实现了给SQL增加自定义注解（hint），主要用于Mycat

加解密的启发： https://github.com/jOOQ/jOOQ/issues/3078
