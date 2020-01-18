FROM java:8
ADD ../target/microservice-simple-demo.jar demo.jar
RUN echo "Asia/shanghai" > /etc/timezone;
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime;
EXPOSE 8081
ENTRYPOINT ["java","-jar","/demo.jar"]