# 该项目使用maven搭建的父子项目，用来测试dubbo+zookeeper+2个服务提供者+一个服务消费者
## 项目搭建步骤： 
	第一步：安装jdk1.8
### 第一步：安装jdk1.8
### 第二步：安装zookeeper
### 第三步：安装tomcat 
### 第四步：下载dubbo并打包到tomcat测试dubbo-admin-2.6.0 
### 第五步：创建项目
	>5.1：创建maven项目：dubbo_moreModule(父项目)
	>5.2：创建maven项目：dubbo1-Service(子项目：提供接口) 
	>5.3：创建maven项目：dubbo1-Providerr(子项目：服务提供者) 
	>5.4：创建maven项目：dubbo1-Comsumer(子项目：服务消费者） 
### 第六步：启动zookeeper、tomcat 
### 第七步: 启动服务提供者，最后启动服务消费者
### 第八步：在dubbo-web界面查看服务http://localhost:8080/dubbo-admin-2.6.0/
