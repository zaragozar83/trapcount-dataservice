FROM openjdk:8-jdk-alpine
EXPOSE 8084
ARG JAR_FILE=target/dataservice-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} dataservice.jar
ENTRYPOINT ["java","-jar","/dataservice.jar"]