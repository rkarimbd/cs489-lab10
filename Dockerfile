# Use the official OpenJDK 17 image with Alpine Linux
FROM openjdk:17-jdk-alpine

# Copy the JAR file from the target directory to the container's root directory
COPY target/ADSSystem-v1.jar /app/app-v2.jar

# Set the working directory to /app
WORKDIR /app

# Expose port 8080 to the outside world
EXPOSE 8080

# Specify the command to run your application
ENTRYPOINT ["java", "-jar", "app-v2.jar"]


