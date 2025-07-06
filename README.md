# Clover App -- WIP

**Clover App** is a Spring Boot-based backend application designed to manage a lottery-style betting system with a clear layered structure, a PostgreSQL database, and robust role-based access. The system supports **admin game management**, **client bet placement**, **round-based draws**, and **winner reporting**.

This project showcases scalable backend architecture for cloud deployment with separation of concerns, externalized infrastructure, and modern CI/CD practices. It is deployed on **Render.com**, uses **Neon PostgreSQL** as the primary data store, and is exposed through **Cloudflare** for security and performance.

---

## 📌 Functional Overview

### 🔐 Authentication & Authorization
- JWT-based login and role-based access control.
- Roles: `ADMIN`, `CLIENT`.
- Clients must register before placing bets.
- Admins manage games, rounds, and reporting.

### 🎮 Game & Round Management
- Admins can:
  - Create games with configurable closing times.
  - Define multiple rounds per game.
- The system automatically:
  - Closes games when time expires.
  - Assigns random numbers to rounds.

### 🎰 Betting Engine
- Clients:
  - Place bets on active rounds.
  - Submit number selections.
- Constraints:
  - Bets must be submitted at least 24 hours before a round closes.
  - No online payment integration (in-person payment only).
- Admins can mark bets as `PAID` or `UNPAID`.

### 📈 Reports & Winner Calculation
- After each round closes:
  - A **Render background worker** is triggered to calculate number of hits per bet.
  - Top-3 winner reports are generated asynchronously.
  - Optional CSV export supported.
  - Results are made availab918920
  - le via admin endpoints.

---

## 🧱 Tech Stack

### 🛠 Backend
- **Java 21** + **Spring Boot 3**
- **Spring Security** (JWT)
- **Spring Web** (REST APIs)
- **Spring Data JPA** (PostgreSQL)
- **Spring Scheduler** (game/round automation)
- **Testcontainers** + **JUnit 5**

### ☁️ Cloud & Infra
- **Render.com** – Application hosting (main app + background worker)
- **Neon PostgreSQL** – Serverless relational DB with pooling & branching
- **Cloudflare** – CDN, DDoS protection, DNS & TLS
- **Render Background Worker** – Asynchronous winner calculation & CSV export
- **Docker** – Local dev containerization
- **GitHub Actions** – CI/CD pipeline for build, test, deploy

---

## 🗃️ Relational Database Schema (PostgreSQL)

Normalized schema includes:

- `clients` – Users and roles
- `games` – Game lifecycle data
- `rounds` – Linked to games with closing times and draw numbers
- `bets` – Linked to rounds and clients
- `admins` – Admin user profiles
- (Future) `report_tasks` – Report metadata and processing status

---

## 🚀 Deployment Targets

### ✅ Render.com
- Hosts the Spring Boot application (API)
- Also runs background worker for report generation
- GitHub or Docker-based CI/CD
- Autoscaling with HTTPS support

### ✅ Cloudflare
- Proxies API requests to Render
- DNS, DDoS protection, and TLS termination

### ✅ Neon (PostgreSQL)
- Primary data store for transactional logic
- Integrated into Spring via JDBC



---

## 🧪 Test Strategy

- **Unit Tests** – JUnit 5 + Mockito
- **Integration Tests** – Spring Boot Test + Testcontainers (PostgreSQL)
- **API Tests** – RestAssured for E2E
- CI/CD: **GitHub Actions** for test + deploy

---

## 📘 Roadmap

- [ ] Game creation and scheduling
- [ ] Round number draw automation
- [ ] Bet placement with constraints
- [ ] Manual payment tracking
- [ ] Admin-auth report API
- [ ] Winner calculation using background worker
- [ ] CSV generation and optional file storage
- [ ] Frontend Admin Dashboard (React)
- [ ] Caching layer for leaderboard reports (Redis)
- [ ] Event-driven enhancements (webhooks, queues)

---

## 📄 License

This project is open-source under the MIT License. See `LICENSE` for details.

---

## 🤝 Contributing

Contributions, ideas, and feedback are welcome!  
Create issues or submit PRs to help improve Clover App.


