FROM openjdk:8-jdk-alpine
WORKDIR /usr/src/app
RUN addgroup -S app && adduser -S app -G app
USER app:app
ARG JAR_FILE=target/*-shaded.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/usr/src/app/app.jar"]
