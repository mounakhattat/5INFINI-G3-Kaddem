FROM openjdk:8
EXPOSE 8089
ADD target/5INFINI-G3-Khaddem-4.0.jar 5INFINI-G3-Khaddem-4.0.jar
ENTRYPOINT ["java","-jar","/5INFINI-G3-Khaddem-4.0.jar"]
# fadit

