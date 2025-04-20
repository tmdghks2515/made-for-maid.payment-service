package io.madeformaid.payment

import io.madeformaid.shared.context.EnableAuthContext
import io.madeformaid.shared.exception.EnableGlobalExceptionHandling
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAuthContext
@EnableGlobalExceptionHandling
@SpringBootApplication
class PaymentServiceApplication

fun main(args: Array<String>) {
	runApplication<PaymentServiceApplication>(*args)
}
