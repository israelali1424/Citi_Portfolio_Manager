FROM openjdk:11
ADD target/Portfolio-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]