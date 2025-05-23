# 🏦 Spring Boot GraphQL Federation - Banking System

A **modular microservices architecture** for a **Banking System**, built using **GraphQL Federation** and **Spring Boot** (Java-only backend). This project demonstrates how to structure and federate GraphQL APIs with subgraphs for `Accounts`, `Transactions`, and a `Gateway`.

---

## 🌐 Architecture Overview

```
┌────────────┐        ┌─────────────────────┐
│  Client    │──────▶│  Java Gateway (GraphQL Federation)
└────────────┘        └────────┬────────────┘
                               │
             ┌────────────────┴─────────────┐
             │                              │
     ┌───────▼────────┐            ┌────────▼────────┐
     │ Accounts Subgraph│          │ Transactions Subgraph │
     └──────────────────┘          └───────────────────────┘
```

---

## 🧩 Project Modules

### 📦 `gateway/`
- Acts as the **GraphQL federated gateway** using `graphql-java`.
- Collects and composes schemas from all subgraphs.
- Single entry point for GraphQL clients.

### 📦 `accounts/`
- Contains account-related types and queries.
- Resolves `Account` entities and exposes mocked data.
- Extended with `@key` and `@external` fields for federation.

### 📦 `transactions/`
- Contains transaction-related types and queries.
- Supports querying transactions by account.
- Links back to the `Account` type via federation.

---

## ⚙️ Technologies Used

- 🔧 **Spring Boot 3.x**
- 🔗 **GraphQL Java**
- 🌐 **GraphQL Federation (Apollo-style)**
- 🐳 **Docker Compose**
- 📦 **Gradle** as the build tool
- 🧪 **Mocked data** for simplicity

---

## 🚀 Running the Project

### 1. Clone the Repo

```bash
git clone git@github.com:SureshKotte-Simon/springboot-graphql-federation-banking.git
cd springboot-graphql-federation-banking
```

### 2. Build all modules

```bash
./gradlew clean build
```

### 3. Run using Docker Compose

```bash
docker-compose up --build
```

- 🌐 Gateway: `http://localhost:4000/graphql`
- 🧾 Accounts Service: `http://localhost:8080`
- 💰 Transactions Service: `http://localhost:8081`

---

## 🔍 Sample Queries

### Get All Accounts with Transactions

```graphql
query {
  accounts {
    id
    holderName
    balance
    transactions {
      id
      amount
    }
  }
}
```

### Get Transactions by Account

```graphql
query {
  transactionsByAccount(accountId: "1") {
    id
    amount
  }
}
```

---

## 💡 Future Enhancements

- ✅ Replace mock data with real database integration
- 🔐 Add OAuth2 / JWT-based security
- 📈 Integrate Prometheus / Grafana monitoring
- ⚙️ GitHub Actions CI/CD pipeline

---

## 📁 Folder Structure

```
springboot-graphql-federation-banking/
│
├── accounts/         # Account subgraph service
├── transactions/     # Transactions subgraph service
├── gateway/          # GraphQL federated gateway (Java)
├── docker-compose.yml
├── build.gradle
└── README.md
```

---

## 👨‍💻 Maintainer

[Suresh Kotte](https://github.com/SureshKotte-Simon) – Feel free to open issues or contribute!

---

## 📜 License

This project is licensed under the MIT License.
