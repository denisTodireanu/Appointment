FROM maven:3.6.1-jdk-8 as myfunnybuilder
WORKDIR /app
COPY ./pom.xml ./
RUN mvn install -DskipTests
COPY ./ ./
RUN mvn install -DskipTests
FROM openjdk:8-jre-slim
COPY myfunnybuilder/app/target/application-0.0.1-SNAPSHOT.jar /usr/src/hola/
WORKDIR /usr/src/hola
CMD ["java", "-jar", "application-0.0.1-SNAPSHOT.jar"]