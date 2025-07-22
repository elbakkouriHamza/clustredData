# ClusteredData Warehouse

A robust Spring Boot application to manage Foreign Exchange (FX) deals, built for reliability, testability, and modern cloud-native deployment.

---

## 🚀 Features

- REST API for FX deals
- Data persistence with PostgreSQL using Spring Data JPA
- Input validation with Hibernate Validator
- DTO mapping with ModelMapper
- Environment variable management via Dotenv
- Developer productivity tools (DevTools, Makefile)
- Code coverage with Jacoco
- Container-ready with Docker & Docker Compose

---

## 📦 Tech Stack

| Layer           | Technology                   |
|-----------------|-----------------------------|
| Core Framework  | Spring Boot 3.5.0           |
| Language        | Java 17                      |
| ORM/DB Layer    | Spring Data JPA, PostgreSQL |
| Validation      | Hibernate Validator          |
| Mapping         | ModelMapper                  |
| Testing         | JUnit 5, Spring Boot Test   |
| Utilities       | Lombok, Dotenv              |
| Dev Tools       | Spring Boot DevTools         |
| Build           | Maven, Makefile              |
| Coverage        | Jacoco                       |
| Containerization| Docker, Docker Compose       |

---

## 🔗 API Example

**Create a Deal**

`POST /api/deals`

```json
{
  "id": "DL20250722",
  "fromCurrencyIsoCode": "USD",
  "toCurrencyIsoCode": "EUR",
  "dealAmount": 15000.0,
  "timestamp": "2025-07-22T10:30:00"
}
```

---

## 🛠️ Development & Deployment

### Prerequisites

- Java 17+
- Maven 3.8+
- Docker & Docker Compose (for container-based workflow)
- Make (for automated tasks, optional but recommended)

### Build & Test

Run tests (with coverage):

```bash
make test
```
> Code coverage report will be in `target/site/index.html`

### Run in Docker (App + PostgreSQL)

Start all services:
```bash
make run
```
Shut down:
```bash
make down
```

### Environment Variables

Create a `.env` file for sensitive data (not committed):

```env
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/clustreddata
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=admin
```

---

## 🗄️ Project Structure

- `/src` — Application source code
- `/test` — Unit and integration tests
- `/Dockerfile` — Container build file
- `/docker-compose.yml` — Multi-service orchestration
- `/Makefile` — Automation for test/build/run

---

## 🔌 Ports

| Service            | Port  |
|--------------------|-------|
| Spring Boot App    | 8084  |
| PostgreSQL         | 5432  |

---

## 🧑‍💻 Contact & Support

For issues or support, contact:  
[elbakkourihamza66@gmail.com](mailto:elbakkourihamza66@gmail.com)

---

*Built with Spring Boot 3.5.0 · Java 17 · Docker-ready · MIT License*