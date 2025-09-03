![header](https://capsule-render.vercel.app/api?type=waving&color=gradient&height=80&section=header)

# 🌍 Timezone Buddy API

A simple Spring Boot REST API that fetches and displays the current local time for multiple cities.  
Useful for remote teams, global meetings, or anyone working across timezones.  

---

## ✨ Features
- ✅ Get current time for multiple cities in a single request  
- ✅ Built with **Spring Boot** + **WorldTimeAPI**  
- ✅ JSON response format for easy integration  
- ✅ Extendable for more advanced time utilities (e.g., time differences)  

---

## 🚀 Tech Stack
- ☕ Java 21  
- 🍃 Spring Boot  
- 🌐 RestTemplate (for API integration)  
- 📦 Maven  

---

## 📦 Installation & Setup

### Prerequisites
- Java 17+ (tested on Java 21)  
- Maven 3.8+  

🔗 API Usage
Endpoint
GET /time?cities=Tokyo,London,Delhi

Example Request
curl "http://localhost:8080/time?cities=Tokyo,London,Delhi"

Example Response
{
  "Tokyo": "2025-09-02T10:20:30+09:00",
  "London": "2025-09-02T02:20:30+01:00",
  "Delhi": "2025-09-02T06:50:30+05:30"
}

### Clone & Run
```bash
# Clone repository
cd timezone-buddy

# Build and run
mvn spring-boot:run
