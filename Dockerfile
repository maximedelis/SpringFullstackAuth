FROM gradle:8.14.2-jdk24-alpine AS builder

COPY build.gradle settings.gradle gradlew ./

COPY src ./src
COPY gradle ./gradle

RUN chmod +x ./gradlew
RUN ./gradlew clean bootJar

# Minimal RE
FROM amazoncorretto:24-alpine

RUN cd /opt

COPY --from=builder /home/gradle/build/libs/website-0.0.1-SNAPSHOT.jar website.jar

EXPOSE 8080

CMD ["java", "-jar", "website.jar"]
