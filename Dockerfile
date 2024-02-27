FROM openjdk:8
EXPOSE 8089
COPY target/5INF*.jar 5INFINI-G3-kaddem-4.0.jar
ENTRYPOINT ["java","-jar","/5INFINI-G3-kaddem-4.0.jar"]
# fadit

