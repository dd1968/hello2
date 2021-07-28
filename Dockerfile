FROM bellsoft/liberica-openjdk-alpine-musl:11
WORKDIR /
ARG JAR=hello2-0.0.1-SNAPSHOT.jar
ADD /target/$JAR app.jar
EXPOSE 8080
CMD java -jar app.jar
