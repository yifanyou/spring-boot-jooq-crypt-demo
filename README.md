# 简要说明
Spring boot + JOOQ + THYMELEAF 一个简单的CRUD展示

* 利用JOOQ的Converter实现了对数据库字段的加解密功能
* 利用JOOQ的ExecuteListner实现了给SQL增加自定义注解（hint）
 * 主要用于Mycat。比如select或者show前面加上 /*balance*/注解，可以使得Spring中注解Transactional（ReadOnly=true）方法中的查询sql也访问readNode
加解密的启发： https://github.com/jOOQ/jOOQ/issues/3078
