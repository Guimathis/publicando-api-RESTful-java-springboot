# Bootcamp Santander - Backend com Java
  Java RESTful api criada para bootcamp com java

  ## Diagrama de Classes

  ```mermaid
classDiagram
  class Person {
    -String name
    -String age
    -Address adress
    -WebSocials webSocials
    -List~Moment~ moments
  }
  
  class Address {
    -String street
    -String number
    -String district
  }

  class WebSocials {
    -String instagram
    -String whatsapp
  }
  
  class Moment {
    -String date
    -String description
  }
  
  Person *-- Address
  Person *-- WebSocials
  Person *-- Moment
```
