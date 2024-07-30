
FROM openjdk:17
EXPOSE 4041
COPY target/Sb-Mysql-App.war Sb-Mysql-App.war
ENTRYPOINT["java","-war","/Sb-Mysql-App.war"]