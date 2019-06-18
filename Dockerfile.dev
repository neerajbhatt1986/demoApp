FROM maven:3.6.1-jdk-8-alpine
WORKDIR demoApp
COPY . .
RUN mvn clean install -DskipTests;
#COPY . .
CMD ["mvn", "spring-boot:run"]