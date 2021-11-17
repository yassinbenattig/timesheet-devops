FROM openjdk:8-jdk-alpine
EXPOSE 8081
ADD target/timesheet-devops-1.3-SNAPSHOT.jar timesheet-devops-1.3-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/timesheet-devops-1.3-SNAPSHOT.jar"]
