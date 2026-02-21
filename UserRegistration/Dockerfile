FROM eclipse-temurin:17-jre
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} user-registration.jar
ENTRYPOINT ["java","-jar","/user-registration.jar"]
