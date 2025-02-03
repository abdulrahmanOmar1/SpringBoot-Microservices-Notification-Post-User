# Spring Boot Microservices - Notification, Post, and User Services

This project is a **Spring Boot Microservices Architecture** that consists of three independent services that communicate with each other using **REST APIs** and service discovery via **Eureka Server**.

## 🚀 Project Overview
The system consists of three microservices:

1. **NotifyApiService (Notification Service)** - Handles notifications data.
2. **PostApiService (Post Service)** - Manages user posts.
3. **UserApiService (User Service)** - Aggregates data from both notification and post services.
4. **Eureka Server** (Service Registry) - Manages service discovery for seamless communication between microservices.

## 📁 Project Structure
```
SpringBoot-Microservices-Notification-Post-User/
│── NotifyApiService/          # Notification Microservice
│── PostApiService/            # Post Microservice
│── UserApiService/            # User Microservice (Consumes both services)
│── EurekaServer/EurekaServer            # Service Registry
│── README.md                  # Documentation
```

---

## ⚙️ Tech Stack
- **Spring Boot** - Backend framework
- **Spring Cloud Netflix Eureka** - Service Discovery
- **RestTemplate** - Service-to-service communication
- **Lombok** - Simplifies Java code
- **Maven** - Dependency management
- **Java 17+** - Programming language

---

## 🔧 How to Run the Project
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/abdulrahmanOmar1/SpringBoot-Microservices-Notification-Post-User.git
cd SpringBoot-Microservices-Notification-Post-User
```

### 2️⃣ Start Eureka Server
Navigate to the **EurekaServer** folder and run:
```sh
mvn spring-boot:run
```
Eureka Server should now be running on [http://localhost:8999](http://localhost:8999).

### 3️⃣ Start Each Microservice
For each service (**NotifyApiService**, **PostApiService**, **UserApiService**), navigate to the respective folder and run:
```sh
mvn spring-boot:run
```
This will start the services on:
- **Notification Service** → `http://localhost:8082`
- **Post Service** → `http://localhost:8081`
- **User Service** → `http://localhost:8080`

---

## 📌 API Endpoints
### ✅ **Notification Service (NotifyApiService)**
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/notifications/{notificationId}` | Fetch notification details |

### ✅ **Post Service (PostApiService)**
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/posts/{postId}` | Fetch post details |

### ✅ **User Service (UserApiService)**
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/users/{userId}` | Fetch user data along with posts & notifications |

Example response from `GET /users/1`:
```json
{
  "userId": 1,
  "userName": "John Doe",
  "posts": {
    "postId": 1,
    "desc": "This is a sample post."
  },
  "notifications": {
    "notificationId": 1,
    "desc": "You have a new friend request."
  }
}
```

---

## 🔄 Service Communication Flow
1. **UserApiService** receives a request for user data.
2. It fetches **post data** from `PostApiService`.
3. It fetches **notification data** from `NotifyApiService`.
4. It combines all the data and returns a consolidated response.

---

## 🎯 Future Enhancements
- ✅ **Load Balancing** using `Spring Cloud LoadBalancer`
- ✅ **Feign Client** for better inter-service communication
- ✅ **Spring Cloud Gateway** for API management
- ✅ **Docker & Kubernetes** for containerization and deployment

---

## 🤝 Contributing
Feel free to submit issues or pull requests! 🚀

📩 **Contact:** [LinkedIn](https://www.linkedin.com/in/abdulrahman-almahmoud-b10636274/)

