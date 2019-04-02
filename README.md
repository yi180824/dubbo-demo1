# dubbo-demo1
项目搭建步骤：
第一步：安装jdk1.8
第二步：安装zookeeper
第三步：安装tomcat
第四步：下载dubbo并打包到tomcat测试dubbo-admin-2.6.0
第五步：创建项目
       第一步：创建maven项目：dubbo-demo（提供接口）
       第二步：创建maven项目：dubboProvider1（接口实现类1）
       第三步：创建maven项目：dubboProvider2（接口实现类2）
       第四步：创建maven项目：dubboConsumer（接口消费者）
第六步：启动zookeeper、tomcat
第七步: 启动服务提供者1，服务提供者2，最后启动服务消费者