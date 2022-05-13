FROM openjdk:17
ADD target/DockerDemo-0.0.1-SNAPSHOT.jar DockerDemo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "DockerDemo-0.0.1-SNAPSHOT.jar"]