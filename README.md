# Santander Dev Week
Criando um API Restful com Spring Boot 3 e Railway, projeto feito durante a Santander Dev Week 2023.

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        - String name
        - Account account
        - Features[] features
        - Card card
        - News[] news
    }

    class Account {
        - String number
        - String agency
        - Number balance
        - Number limit
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String number
        - Number limit
    }

    class News {
        - String icon
        - String description
    }

    User "1" *-- "1" Account 
    User "1" *-- "N" Feature 
    User "1" *-- "1" Card
    User "1" *-- "N" News

```

<h6 align="center"><a href="https://sdw-2023-api-prd.up.railway.app/swagger-ui/index.html">**Link para testar o projeto**</a></h6>

## Principais Tecnologias
* Java
* Spring Boot
* Spring JPA
* OpenAPI (Swagger)
* Railway

  <hr>

  [![Linkedin Badge](https://img.shields.io/badge/-JeanCarlo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/jeancarlotorre619b/)](https://www.linkedin.com/in/jeancarlotorre619b/)

<hr>
<h3>Contribuindo</h3>
⭐️ Star o projeto
🐛 Encontrar e relatar issues
  
