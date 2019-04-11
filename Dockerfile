FROM openjdk:8
ADD target/com.senchenko.integration-1.0-SNAPSHOT.jar com.senchenko.integration-1.0-SNAPSHOT.jar
EXPOSE 8081
CMD java -jar com.senchenko.integration-1.0-SNAPSHOT.jar