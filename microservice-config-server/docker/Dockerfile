FROM java:8
ADD ../microservice-config-server/target/microservice-config-server.jar config-server.jar
RUN echo "Asia/shanghai" > /etc/timezone;
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime;
EXPOSE 9000
ENTRYPOINT ["java","-jar","/config-server.jar"]