# Use Java 17
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy everything
COPY . .

# Build the project
RUN ./mvnw clean package -DskipTests

# Run the jar
CMD ["java", "-jar", "target/task-0.0.1-SNAPSHOT.jar"]
