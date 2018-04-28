FROM openjdk:8-jdk-alpine
COPY target/greenwich157-crm.jar /tmp/app.jar
VOLUME /tmp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
