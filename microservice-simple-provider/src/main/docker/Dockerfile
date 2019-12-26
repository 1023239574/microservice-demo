FROM java:8
ADD microservice-simple-provider provider.jar
RUN echo "Asia/shanghai" > /etc/timezone;
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime;
EXPOSE 8081
ENTRYPOINT ["java","-jar","/provider.jar"]