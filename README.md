Steps:
1) Build and run locally:>  ./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar
2) Build and push the docker image: 
    - mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
    - docker push naveenhm/java:log4j2
    - docker push naveenhm/java:log4j2
3) Run Fargate task with 1.4 version and check the CW logs
