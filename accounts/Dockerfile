#Java runtime base image
FROM openjdk:11-slim as build

#Author of image
LABEL maintainer="soriano3.com"

#Add application's jar to the container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute application
ENTRYPOINT ["java","-jar","/accounts-0.0.1-SNAPSHOT.jar"]