# Spring Fullstack Authentication

Updated fullstack authentication using Spring Security and Thymeleaf.

- Gradle 8.14.2
- Java 24

Supports direct run with H2 DB or `docker compose` with PostgresSQL.

## Getting started

### Using `compose`

- Created a `.env` file:

```
DB_URL=jdbc:postgresql://postgresql:5432/postgres
DB_USER=postgres
DB_PASSWORD=password
DB_DRIVER=org.postgresql.Driver

HIBERNATE_DIALECT=org.hibernate.dialect.PostgreSQLDialect

HOST_IP=localhost
HOST_PORT=8080
```

- Run `docker compose up -d`

### Locally run the project

By default, it will use the `.env.test` file (H2 DB).

```bash
./gradlew bootRun
```

If you want to use a local PostgreSQL instance, update your `.env` with the IP of your DB. Run the project with the `.env` variables loaded.

## Info

Careful, H2 console is enabled.
