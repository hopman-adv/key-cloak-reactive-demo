package keycloak.reactive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class KeycloakReactiveApplication

fun main(args: Array<String>) {
	runApplication<KeycloakReactiveApplication>(*args)
}
