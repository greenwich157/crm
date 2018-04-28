FROM openjdk:8-jdk-alpine
COPY target/crm-0.0.1-SNAPSHOT.jar /tmp/app.jar
VOLUME /tmp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
