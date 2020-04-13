FROM java:8-jdk-alpine
ADD target/app.jar application.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","application.jar"]
