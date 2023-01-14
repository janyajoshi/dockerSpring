FROM openjdk:17
EXPOSE 5000
ADD build/libs/springDocker-0.0.1.jar springDocker-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/springDocker-0.0.1.jar"]