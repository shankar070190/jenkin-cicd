FROM Openjdk:21
expose 8088
ADD traget/jenkins-cicd.jar jenkins-cicd.jar
ENTRYPOINT["java","-jar","/jenkins-cicd.jar"]