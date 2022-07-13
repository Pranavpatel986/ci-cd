From openjdk:11
ADD target/Devops-project.jar Devops-project.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","Devops-project.jar"]