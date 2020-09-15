FROM java:8
ADD jdbctest-0.0.1-SNAPSHOT.jar jdbctest-0.0.1-SNAPSHOT.jar
EXPOSE 31120
ENTRYPOINT ["java","-jar","jdbctest-0.0.1-SNAPSHOT.jar"]