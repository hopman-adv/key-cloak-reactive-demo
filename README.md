# Keycloak Reactive with Postgres
## Stack
- Kotlin
- Spring Boot
- Spring WebFlux
- Spring OAuth Resource Server
- Spring Security

Basic demo to show how use Keycloak. Keycloak needs to be started in Docker beforehand.
Uses Webflux and Spring Security with Kotlin DSL.

## Description
Application has 3 REST endpoints:
- public - accessible by everyone
- private - accessible by authenticated user in Keycloak
- private with role - accessible by authenticated user in Keycloak with "reader"

There is Jwt Converter in SecurityConfig which takes roles from Keycloak Jwt token.
Then it maps Keycloak roles to authorities, therefore hasAuthority can be used on methods.