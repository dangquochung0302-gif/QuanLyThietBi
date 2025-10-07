# Sử dụng image Java chính thức
FROM openjdk:17-jdk-slim

# Tạo thư mục ứng dụng trong container
WORKDIR /app

# Copy file JAR đã build vào container
COPY target/QuanLyThietBi-0.0.1-SNAPSHOT.jar app.jar

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
