FROM maven:3.6.1-jdk-8-alpine AS builder
WORKDIR demoApp
COPY pom.xml .
RUN mvn clean compile
COPY . .
CMD ["mvn", "clean", "install"]

FROM maven:3.6.1-jdk-8-alpine
WORKDIR demoApp
EXPOSE 8080
COPY --from=builder /demoApp/target/demoApp-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "demoApp-0.0.1-SNAPSHOT.jar"]
