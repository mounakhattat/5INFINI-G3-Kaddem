FROM openjdk:12-alpline
EXPOSE 8089
ADD target/5INF*.jar 5INFINI-G3-Khaddem-4.0.jar
ENTRYPOINT ["java","-jar","/5INFINI-G3-Khaddem-4.0.jar"]
# fadit

