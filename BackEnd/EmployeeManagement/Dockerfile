# Use a suitable OpenJDK base image
FROM eclipse-temurin:17-jre-alpine
COPY ./out/artifacts/employee_management_jar/ .
CMD ["java", "-jar", "employee-management.jar"]
EXPOSE 8080