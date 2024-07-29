FROM openjdk:17
EXPOSE 9090
COPY target/Sb-Mysql-App.war Sb-Mysql-App.war
ENTRYPOINT["java","-jar","/Sb-Mysql-App.war"]