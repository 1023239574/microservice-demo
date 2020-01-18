FROM java:8
ADD ../../../target/microservice-discovery-eureka.jar Eureka.jar
RUN echo "Asia/shanghai" > /etc/timezone;
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime;
EXPOSE 8761
ENTRYPOINT ["java","-jar","/Eureka.jar"]