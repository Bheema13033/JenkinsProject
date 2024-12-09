FROM openjdk:21
EXPOSE 8080
ADD target/Docker.jar Docker.jar
ENTRYPOINT ["java","-jar","/Docker.jar"]