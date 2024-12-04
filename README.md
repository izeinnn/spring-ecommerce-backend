# ShopProject

## Overview

ShopProject is a comprehensive e-commerce platform designed to provide a seamless shopping experience for users. It includes features such as product listings, shopping cart, user authentication, and order management.

## Features

- User authentication and authorization
- Product catalog with search and filter functionality
- Shopping cart and checkout process
- Order management and tracking
- Admin panel for managing products, orders, and users

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6.3 or higher

## Installation

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:

   ```bash
   cd ShopProject
   ```

3. Install dependencies:

   ```bash
   ./mvnw clean install
   ```

4. Running the Application:

   ```bash
   ./mvnw spring-boot:run
   ```

## Usage

Start the development server:
npm start

Open your browser and navigate to http://localhost:3000.

## Contributing

Fork the repository.
Create a new branch

```bash
git checkout -b feature-branch
```

Make your changes and commit them:

```bash
git commit -m "Description of your changes"
```

Push to the branch:

```bash
git push origin feature-branch
```

Create a pull request.

Project Modules
Services
OrderItemServiceImpl: Implements the order item service.
ProductServiceImpl: Implements the product service.
UserServiceImpl: Implements the user service.
Security
JwtUtils: Utility class for handling JWT operations.

Dependencies
Key dependencies used in this project:

Spring Boot
Spring Data JPA
Spring Security
Lombok
AWS SDK for S3
JJWT

## License

This project is licensed under the MIT License.
