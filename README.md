# trapcount-dataservice

## Run Docker image of the dataservice
- mvn spring-boot:build-image
- docker run -it -p 8080:8084 dataservice:0.0.1-SNAPSHOT
- docker run -it -p 8084:8084 dataservice:0.0.1-SNAPSHOT
###
- docker build -t .
- docker run -p 8080:8080
