
FROM openjdk:17-jdk-slim

WORKDIR /app

# 3. Copia il file JAR della tua applicazione nel container
COPY target/AW-0.0.1-SNAPSHOT.jar.original app.jar

# 4. Espone la porta che la tua applicazione utilizza (solitamente 8080 per Spring Boot)
EXPOSE 8080

# 5. Comando per avviare l'applicazione
CMD ["java", "-jar", "app.jar"]
