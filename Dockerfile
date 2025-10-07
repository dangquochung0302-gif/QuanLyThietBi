# ==========================================
# GIAI ĐOẠN 1: Build ứng dụng bằng Maven
# ==========================================
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Đặt thư mục làm việc trong container
WORKDIR /app

# Copy file cấu hình Maven trước (để cache dependency)
COPY pom.xml .

# Tải dependency để tiết kiệm thời gian build lại
RUN mvn dependency:go-offline

# Copy toàn bộ mã nguồn
COPY src ./src

# Build ứng dụng (tạo file .jar trong thư mục target)
RUN mvn clean package -DskipTests

# ==========================================
# GIAI ĐOẠN 2: Chạy ứng dụng
# ==========================================
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy file JAR từ giai đoạn build
COPY --from=build /app/target/*.jar app.jar

# Mở cổng 8080
EXPOSE 8080

# Câu lệnh chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
