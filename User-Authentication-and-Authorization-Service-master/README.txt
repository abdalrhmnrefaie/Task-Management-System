
User Authentication and Authorization Service 


<<........Project 1 ..............>>


```
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           ├── config
    │   │           │   ├── BeanConfig.java
    │   │           │   └── SecurityConfig.java
    │   │           ├── controller
    │   │           │   ├── LoginController.java
    │   │           │   ├── SignupController.java
    │   │           │   └── UserController.java
    │   │           ├── dto
    │   │           │   ├── CustomUser.java
    │   │           │   ├── ErrorDto.java
    │   │           │   ├── LoginRequest.java
    │   │           │   ├── LoginResponse.java
    │   │           │   ├── SignupRequest.java
    │   │           │   └── UserDto.java
    │   │           ├── exception
    │   │           │   ├── ApiError.java
    │   │           │   ├── CustomAuthenticationEntryPoint.java
    │   │           │   ├── CustomExceptionHandler.java
    │   │           │   └── CustomException.java
    │   │           ├── filter
    │   │           │   └── JwtAuthenticationFilter.java
    │   │           ├── model
    │   │           │   ├── Role.java
    │   │           │   └── User.java
    │   │           ├── repository
    │   │           │   ├── RoleRepository.java
    │   │           │   └── UserRepository.java
    │   │           ├── service
    │   │           │   ├── impl
    │   │           │   │   ├── LoginServiceImpl.java
    │   │           │   │   ├── RoleServiceImpl.java
    │   │           │   │   ├── SignupServiceImpl.java
    │   │           │   │   └── UserServiceImpl.java
    │   │           │   ├── LoginService.java
    │   │           │   ├── RoleService.java
    │   │           │   ├── SignupService.java
    │   │           │   └── UserService.java
    │   │           ├── UserAuthenticationAndAuthorizationServiceApplication.java
    │   │           └── util
    │   │               ├── AuthenticationUser.java
    │   │               └── JwtUtil.java
    │   └── resources
    │       └── application.properties
```

---

 **technology**
- Programming Language: Java 17
- Backend Framework: Spring Boot v3.0.1
- ORM: Hibernate 
- Database Engine: MySql
- API Documentation: Swagger via OpenApi 3.0
- Build Tool: Maven
- Logger: SLF4J


<<........Project 2 ..............>>

|-- main
|   |-- java
|   |   `-- com
|   |       `-- global
|   |           `-- book
|   |               |-- DataJpaBooksProjectApplication.java
|   |               |-- ServletInitializer.java
|   |               |-- basic
|   |               |   |-- BasicEntity.java
|   |               |   |-- BasicRepository.java
|   |               |   `-- BasicService.java
|   |               |-- config
|   |               |   |-- AuditorAwareImpl.java
|   |               |   |-- SchedulerConfig.java
|   |               |   |-- StartUpApp.java
|   |               |   `-- Webconfig.java
|   |               |-- controller
|   |               |   |-- AutherController.java
|   |               |   |-- BookController.java
|   |               |   `-- PostController.java
|   |               |-- entity
|   |               |   |-- Auther.java
|   |               |   |-- Book.java
|   |               |   |-- BookDTO.java
|   |               |   `-- PostDTO.java
|   |               |-- error
|   |               |   |-- CustomErrorAttribute.java
|   |               |   |-- DaplicateRecoredException.java
|   |               |   |-- ErrorResponse.java
|   |               |   |-- GlobalExceptionHandler.java
|   |               |   `-- RecordNotFoundExecption.java
|   |               |-- repository
|   |               |   |-- AutherRepository.java
|   |               |   `-- BookRepository.java
|   |               |-- service
|   |               |   |-- AutherService.java
|   |               |   |-- BookService.java
|   |               |   |-- PostService.java
|   |               |   `-- PriceSchedule.java
|   |               `-- validator
|   |                   |-- IpAddress.java
|   |                   `-- IpAddressImpl.java
|   |-- resources
|   |   |-- application.properties
|   |   |-- bundle
|   |   |   |-- messages.properties
|   |   |   |-- messages_ar.properties
|   |   |   `-- messages_fr.properties
|   |   |-- logback.xml
|   |   |-- static
|   |   `-- templates
|   `-- webapp
`-- test
    `-- java
        `-- com
            `-- global
                `-- book
                    `-- DataJpaBooksProjectApplicationTests.java


 **technology**
- Programming Language: Java 17
- Backend Framework: Spring Boot v2.6.1
- ORM: Hibernate ,jpa
- Database Engine: MySql
- Build Tool: Maven
- validation



<<........Project 3 ..............>>

|-- main
|   |-- java
|   |   `-- com
|   |       `-- global
|   |           |-- SpringSecurityDemoApplication.java
|   |           |-- confg
|   |           |   |-- StartUpApp.java
|   |           |   `-- WebConfig.java
|   |           |-- controller
|   |           |   |-- RoleController.java
|   |           |   `-- UserController.java
|   |           |-- entity
|   |           |   |-- AppUser.java
|   |           |   |-- Role.java
|   |           |   `-- TokenInfo.java
|   |           |-- error
|   |           |   `-- GlobalHanding.java
|   |           |-- repository
|   |           |   |-- RoleRepo.java
|   |           |   |-- TokenInfoRepo.java
|   |           |   `-- UserRepo.java
|   |           |-- security
|   |           |   |-- AccessTokenDto.java
|   |           |   |-- AppUserDetail.java
|   |           |   |-- AuthController.java
|   |           |   |-- AuthFilter.java
|   |           |   |-- AuthService.java
|   |           |   |-- JWTResponseDto.java
|   |           |   |-- JwtTokenUtils.java
|   |           |   |-- JwtUnAuthResponse.java
|   |           |   |-- LoginRequestDto.java
|   |           |   `-- SecurityConfig.java
|   |           `-- service
|   |               |-- RoleService.java
|   |               |-- TokenInfoService.java
|   |               `-- UserService.java
|   `-- resources
|       `-- application.properties
`-- test
    `-- java
        `-- com
            `-- global
                `-- SpringSecurityDemoApplicationTests.java

 **technology**
- Programming Language: Java 11
- Backend Framework: Spring Boot v2.6.4
- ORM: Hibernate ,jpa
- Database Engine: MySql
- Build Tool: Maven
- Security Jwt




