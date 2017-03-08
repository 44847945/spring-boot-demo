# spring-boot-demo
spring boot project demo

数据库脚本在资源文件目录下 sdemo.sql。

#集成kafka
##第一步，安装运行环境
暂时以windows环境为例
> 下载 `Kafka` 下载链接： `http://kafka.apache.org/downloads.html` 
>   
>  解压，找到 `bin/windows` 目录  
>  
>  启动 `ZooKeeper` ，执行脚本 `zookeeper-server-start ../../config/zookeeper.properties` 
>  
>  启动 `Kafka`，执行脚本 `kafka-server-start ../../config/server.properties`
>    
>  创建 `Topic` 来测试一下，执行脚本：`kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic demo`，创建一个名为"demo"的Topic，该Topic包含一个分区和一个副本。
>  
>  查看 `Topic` 使用kafka-topics --list --zookeeper localhost:2181命令来查看当前的Topic。
>  
>  创建消息生产者，执行脚本 `kafka-console-producer --broker-list localhost:9092 --topic demo`.  
>  
>  创建消费者，执行脚本 `kafka-console-consumer --zookeeper localhost:2181 --topic demo --from-beginning`  
>  
>  发送消息, 在 `kafka-console-producer` 的那个窗口，直接输入消息内容，如：test message 1。然后马上就会在 `kafka-console-consumer` 命令窗口看到消息输出，上面的消息就已经被消费了  
>  
>  至此，可以看到kafka已经独立运行成功了，接下来的问题就是要把kafka集成到项目里去。
>  
>  测试过程当中，如果关闭消费者后，单独发送几条消息，然后再分别顺序停止 kafka 和 zookeeper,然后再顺序启动 zookeeper ， kafka 和 消费者，发现刚才没消费的几条消息又收到了，也即，kafka 默认是有做消息持久化的，那么 kafka 的默认消息持久化是怎么实现的，都有哪些方式呢？

##集成到项目中

```xml
<dependency>
	<groupId>org.springframework.kafka</groupId>
	<artifactId>spring-kafka</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.integration</groupId>
	<artifactId>spring-integration-core</artifactId>
</dependency>

```






