FROM maven:3.8.3-openjdk-17 AS build

WORKDIR /app
COPY  . .
RUN mvn clean install

#second stage
FROM openjdk:17-jdk-slim


COPY --from=build /app/target/app-*.jar /app/app.jar

EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]