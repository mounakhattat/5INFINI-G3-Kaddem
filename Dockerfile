FROM openjdk:8-alpine
EXPOSE 8089
ADD target/5INFINI-G3-Kaddem-4.0.jar 5INFINI-G3-Kaddem-4.0.jar
ENTRYPOINT ["java","-jar","/5INFINI-G3-Kaddem-4.0.jar"]
# fadit

