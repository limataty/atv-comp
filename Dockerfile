FROM openjdk:17-jdk-slim

WORKDIR /app

COPY . .
RUN mvn clean package -DskipTests -DskipTests.skip=true
COPY target/atv-comp-1.0-SNAPSHOT.jar atv-comp.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "atv-comp.jar"]
