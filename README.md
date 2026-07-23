# Hotel Management System

A backend system for managing hotel operations — searching and booking rooms, handling dynamic pricing, processing payments, and giving admins control over reservations. Built with Java and Spring Boot.

Currently a REST API only. Frontend is in progress and will be added soon.

## Tech Stack

- **Java**
- **Spring Boot** – core application framework
- **Spring Security** – authentication and authorization
- **Hibernate** – ORM for database interactions
- **PostgreSQL** – relational database
- **Stripe API** – payment processing and refunds

## Features

### Search & Booking
Users can search for available rooms and make bookings based on availability, dates, and room type.

### Dynamic Pricing & Scheduling
Room prices adjust based on factors like demand, season, or occupancy schedule, instead of using a fixed rate.

### Payments & Refunds (Stripe)
Integrated with Stripe to handle:
- Booking payments
- Refunds for cancellations

### Admin API
A separate set of endpoints for admins to:
- View, update, or cancel bookings
- Manage rooms and pricing
- Oversee overall booking activity

### Security
Spring Security is used to manage authentication and role-based access (e.g., admin vs regular user permissions).

## Database

Uses **PostgreSQL** as the primary database, with Hibernate handling entity mapping and queries.

## Project Status

- ✅ Backend (booking, pricing, payments, admin APIs)
- ⏳ Frontend – coming soon
- ⏳ API documentation – to be added

## Getting Started

### Prerequisites
- Java 17+ (adjust based on your version)
- PostgreSQL installed and running
- Maven

### Setup
1. Clone the repo
   ```bash
   git clone <your-repo-url>
   cd hotelmanagementsystem
   ```
2. Configure your database credentials in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
3. Add your Stripe API keys:
   ```properties
   stripe.api.key=your_stripe_secret_key
   ```
4. Build and run:
   ```bash
   mvn spring-boot:run
   ```

## Roadmap

- [ ] Frontend integration
- [ ] API documentation (Swagger/OpenAPI)
- [ ] Email notifications for bookings
- [ ] Reviews and ratings

## License

Add your license here (MIT, Apache 2.0, etc.)
