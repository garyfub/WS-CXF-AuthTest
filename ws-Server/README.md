WildflyDeployTest
=================

这个项目是用来测试tomcat cxf webservice 的。

前提条件
1. jdk 1.7
2. maven 3

使用方法:
1. 使用命令行到项目目录中
2. mvn clean package tomcat7:run
3. 使用浏览器浏览
http://localhost:8080/cxfWSTest/services


获取一个字符串
http://localhost:8080/cxfWSTest/services/restful/sayHi/wangzi.json


获取一个对象
http://localhost:8080/cxfWSTest/services/restful/getPerson/wangzi.json
http://localhost:8080/cxfWSTest/services/restful/getPerson/wangzi.xml

获取一个对象集合
http://localhost:8080/cxfWSTest/services/restful/getPersons/wangzi.json
http://localhost:8080/cxfWSTest/services/restful/getPersons/wangzi.xml