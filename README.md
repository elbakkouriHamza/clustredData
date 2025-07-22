# ClustredData

A technical assignment to manage FX (Foreign Exchange) deals.

## API Reference

### Send a Deal

```http
POST /api/deals
```

| Parameter             | Type     | Description                             |
|-----------------------|----------|-----------------------------------------|
| `id`                  | string   | **Required.** ID of the deal            |
| `fromCurrencyIsoCode` | string   | **Required.** Source currency ISO code  |
| `toCurrencyIsoCode`   | string   | **Required.** Target currency ISO code  |
| `dealAmount`          | double   | **Required.** Amount of the deal        |

## Deployment

This project uses `Makefile` commands to simplify app management and testing.

### Run Tests

```bash
make test
```

Code coverage is measured using the Jacoco Plugin. Results can be found in the `target/site/index.html` file. The service layer coverage is 100%.

### Start Services

To run the Spring Boot application and PostgreSQL database:

```bash
make run
```

### Shut Down Services

```bash
make down
```

## Tech Stack

- **Server:** Spring Boot, JPA
- **Unit Testing:** JUnit 5, Mockito
- **Database:** PostgreSQL
- **Containerization:** Docker, Docker Compose

## Ports

- Spring Boot App: **8084**
- PostgreSQL Database: **5432**

## Support

For support, email: [elbakkourihamza66@gmail.com](mailto:elbakkourihamza66@gmail.com)