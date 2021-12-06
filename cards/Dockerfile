#Java runtime base image
FROM openjdk:17-slim as build

#Author of image
LABEL maintainer="soriano3.com"

#Add application's jar to the container
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

#Execute application
ENTRYPOINT ["java","-jar","/cards-0.0.1-SNAPSHOT.jar"]