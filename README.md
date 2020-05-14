# 该项目使用maven搭建，用来测试dubbo实现微服务
## 项目介绍
	第一步：为了测试
## 项目搭建步骤： 
	第一步：安装jdk1.8
	第二步：安装zookeeper
	第三步：安装tomcat 
	第四步：下载dubbo并打包到tomcat测试dubbo-admin-2.6.0 
	第五步：创建项目
		5.1：创建maven项目：dubbo-demo(创建服务接口)
		5.2：创建maven项目：dubboProvider1（服务提供者1）
		5.3：创建maven项目：dubboProvider2（服务提供者2）
		5.4：创建maven项目：dubboConsumer（服务消费者） 
	第六步：启动zookeeper、tomcat 
	第七步: 启动2个服务提供者，最后启动服务消费者
	第八步：在dubbo-web界面查看服务http://localhost:8080/dubbo-admin-2.6.0/
