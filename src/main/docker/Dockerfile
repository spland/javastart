From openjdk:8-jdk-alpine
VOLUME /tmp
ADD freemarker.0.0.1.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
