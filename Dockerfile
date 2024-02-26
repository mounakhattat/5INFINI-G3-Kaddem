FROM  openjdk:12-alpine
COPY target/5INFINI-*.jar /5INFINI-G3-kaddem.jar
CMD ["java", "-jar", "/5INFINI-G3-kaddem.jar"]