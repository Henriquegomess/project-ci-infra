FROM openjdk:8
EXPOSE 8080
ADD target/project-ci-infra.jar project-ci-infra.jar
ENTRYPOINT ["java", "-jar", "/project-ci-infra.jar"]