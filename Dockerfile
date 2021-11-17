FROM openjdk:8-jdk-alpine
EXPOSE 8081
ADD target/timesheet-1.3-SNAPSHOT.jar timesheet-1.3-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/timesheet-1.3-SNAPSHOT.jar"]
