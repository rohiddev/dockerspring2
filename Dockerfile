FROM java:8-jdk-alpine
ADD target/app.jar application.jar
EXPOSE 8085:8085
ENTRYPOINT ["java","-jar","application.jar"]
