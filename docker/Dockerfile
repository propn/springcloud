# FROM openjdk:8-jdk-alpine
FROM 127.0.0.1:5000/centos:jkd11
ARG JAR_FILE
VOLUME /servers
ADD ${JAR_FILE} /servers/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/servers/app.jar"]
EXPOSE 8080