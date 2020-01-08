FROM java:8
ADD ./target/microservice-gateway-zuul.jar zuul.jar
RUN echo "Asia/shanghai" > /etc/timezone;
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime;
EXPOSE 8040
ENTRYPOINT ["java","-jar","/zuul.jar"]