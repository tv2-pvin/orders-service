# Base image
FROM openjdk:8-jdk AS BUILD_IMAGE

ENV APP_HOME=/opt/orders/
RUN mkdir -p $APP_HOME/src/main/java
WORKDIR $APP_HOME

COPY build.gradle gradlew  $APP_HOME
COPY gradle $APP_HOME/gradle

# Download dependencies improved usage of docker cache layers
# RUN ./gradlew -x test build
COPY . .
RUN ./mvn package

# Run image
FROM jetty:9.4-jre8-alpine
COPY --from=BUILD_IMAGE /opt/sports-data-soccer/build/libs/orders.war /var/lib/jetty/webapps/
EXPOSE 8080