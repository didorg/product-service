# Product Service

This project is centered around a Java-based application that primarily utilizes GraphQL for its API. In addition, RESTful API endpoints have been implemented for comparison purposes and to provide flexibility for different use cases.

## Features

- **GraphQL API:** A powerful and flexible API for querying and mutating data.
- **RESTful API:** Additional endpoints to support traditional REST operations and to enable comparisons with GraphQL.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven or Gradle for dependency management
- A running instance of the database (e.g., MySQL, PostgreSQL)

### Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/didorg/product-service.git

2. **Navigate to the project directory:**
  ```sh
cd product-service  
```
3. **Build the project:**
```sh
mvn clean install
```
or

```sh
gradle build
```

### Configuration
Update the application.properties file located in src/main/resources with your database and other configuration details.

### Running the Application
1. **Start the application:**
```sh
mvn spring-boot:run
```
or
```sh
gradle bootRun
```
2. **Access the APIs:**
 - GraphQL: Visit [graphql](http://localhost:8181/graphql)
 - REST: Visit [rest](http://localhost:8181/products)



## Usage
#### GraphQL API
To query or mutate data using GraphQL, you can use tools like GraphiQL or Postman.

#### RESTful API
For RESTful operations, you can use standard HTTP methods (GET, POST, PUT, DELETE) via tools like Postman or curl commands.

#### Contributing
We welcome contributions! Please see our CONTRIBUTING.md for guidelines on how to contribute to this project.

#### License  
This project is licensed under the MIT License. See the LICENSE file for details.

#### Acknowledgments
 - Thanks to the open-source community for providing valuable resources and tools.
 - Special thanks to the team members for their hard work and dedication.
