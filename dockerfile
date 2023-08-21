FROM openjdk:17
COPY target/PowerManagement-1.0.0.jar PowerManagement.jar
ENTRYPOINT ["java", "-jar", "/PowerManagement.jar"]