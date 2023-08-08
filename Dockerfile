# Use an appropriate base image that supports your test code environment
FROM gradle:latest

# Set the working directory
WORKDIR /app

# Copy your Gradle project files to the container
COPY build.gradle  ./
COPY src/ src/

# Build your application

# Define the command to run the tests
CMD ["gradle","clean", "test"]
