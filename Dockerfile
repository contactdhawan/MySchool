FROM tomcat:8.0.20-jre8

COPY /target/myschool.war /usr/local/tomcat/webapps/myschool.war

