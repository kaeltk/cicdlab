#Pull base image
FROM tomcat:8-jre8
#Copy to tomcat path
ADD target/cicdProject.war /usr/local/tomcat/webapps


