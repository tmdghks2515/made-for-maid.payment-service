package io.madeformaid.payment

import io.madeformaid.webmvc.context.EnableAuthContext
import io.madeformaid.webmvc.exception.EnableGlobalExceptionHandling
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAuthContext
@EnableGlobalExceptionHandling
@SpringBootApplication
class PaymentServiceApplication

fun main(args: Array<String>) {
	runApplication<PaymentServiceApplication>(*args)
}
