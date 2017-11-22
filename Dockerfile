FROM openjdk:8
RUN mkdir -p /com/c2cgifts/services
ADD target/c2cgifts-0.0.1-SNAPSHOT.jar /com/c2cgifts/services/
EXPOSE 8080
CMD ["java", "-jar", "/com/c2cgifts/services/c2cgifts-0.0.1-SNAPSHOT.jar"]