# Country Service - Direct Access Guide

## 🚀 Current Configuration

Your service now works **independently** without the need for Eureka Server.

- **Base URL**: `http://localhost:8080`
- **Port**: 8080
- **Database**: PostgreSQL (localhost:5432/demo)

## 📍 Available Endpoints

### 1. Get all countries
```http
GET http://localhost:8080/api/countries
```

**Example with cURL:**
```bash
curl http://localhost:8080/api/countries
```

**Expected response:**
```json
[
  {
    "code": "US",
    "name": "United States"
  },
  {
    "code": "ES",
    "name": "Spain"
  }
]
```

### 2. Create a new country
```http
POST http://localhost:8080/api/countries
Content-Type: application/json

{
  "code": "MX",
  "name": "Mexico"
}
```

**Example with cURL:**
```bash
curl -X POST http://localhost:8080/api/countries ^
  -H "Content-Type: application/json" ^
  -d "{\"code\":\"MX\",\"name\":\"Mexico\"}"
```

### 3. Delete a country
```http
DELETE http://localhost:8080/api/countries/{code}
```

**Example with cURL:**
```bash
curl -X DELETE http://localhost:8080/api/countries/MX
```

## 🔧 Starting the Service

### Option 1: From IntelliJ IDEA
1. Open the `crud` project
2. Run the `CountryServiceApplication` class
3. Wait until you see: "Started CountryServiceApplication"

### Option 2: From command line
```bash
cd C:\workspace\demo\back-time-conversion\crud
mvnw spring-boot:run
```

### Option 3: Using the compiled JAR
```bash
cd C:\workspace\demo\back-time-conversion\crud
java -jar target\crud-1.0-SNAPSHOT.jar
```

## ✅ Verify the Service is Running

Open your browser and visit:
```
http://localhost:8080/api/countries
```

If you see a list of countries (it may be empty `[]`), the service is working!

## 🗄️ Prerequisites

Make sure PostgreSQL is running:
- **Host**: localhost
- **Port**: 5432
- **Database**: demo
- **User**: postgres
- **Password**: po-2-fenantrenO

## 🧪 Testing with Postman

1. **GET** - Get countries:
   - Method: GET
   - URL: `http://localhost:8080/api/countries`

2. **POST** - Create country:
   - Method: POST
   - URL: `http://localhost:8080/api/countries`
   - Headers: `Content-Type: application/json`
   - Body (raw JSON):
     ```json
     {
       "code": "FR",
       "name": "France"
     }
     ```

3. **DELETE** - Delete country:
   - Method: DELETE
   - URL: `http://localhost:8080/api/countries/FR`

## 📝 Changes Made

All Eureka configuration has been removed:
- ✅ Removed `spring-cloud-starter-netflix-eureka-client` dependency
- ✅ Removed `@EnableDiscoveryClient` annotation
- ✅ Removed Eureka configuration from `application.properties`
- ✅ The service is now completely standalone

## 🔍 Troubleshooting

**Error: "Port 8080 is already in use"**
- Change the port in `application.properties`:
  ```properties
  server.port=8081
  ```

**Error: "Connection refused to PostgreSQL"**
- Verify that PostgreSQL is running
- Confirm credentials in `application.properties`

**Error 404: "Not Found"**
- Verify that the URL is exact: `/api/countries`
- Make sure the service is running

## 🏗️ Project Structure

```
crud/
├── src/
│   ├── main/
│   │   ├── java/org/example/
│   │   │   ├── CountryServiceApplication.java
│   │   │   ├── controller/
│   │   │   ├── models/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## 🚀 Quick Start

1. Make sure PostgreSQL is running with the `demo` database created
2. Navigate to the crud directory: `cd crud`
3. Run: `mvnw spring-boot:run`
4. Access: `http://localhost:8080/api/countries`
