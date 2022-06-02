FROM openjdk:8
EXPOSE 8080
ADD target/stginfo.jar stginfo.jar
ENTRYPOINT ["java","-jar","/stginfo.jar"]