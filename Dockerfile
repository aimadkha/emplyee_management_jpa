FROM tomcat:9.0-jdk16-temurin
COPY ./target/manage_emp.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]