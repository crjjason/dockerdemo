FROM java:8
# 将jar包添加到容器中并更名为app.jar
ADD target/docker-demo-1.0.jar /docker-demo-1.0.jar
# 运行jar包
ENTRYPOINT ["nohup","java","-jar","/docker-demo-1.0.jar","&"]