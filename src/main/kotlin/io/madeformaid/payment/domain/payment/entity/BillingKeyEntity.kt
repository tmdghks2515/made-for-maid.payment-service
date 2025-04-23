package io.madeformaid.payment.domain.payment.entity

import io.madeformaid.payment.domain.payment.vo.enums.BillingType
import io.madeformaid.payment.domain.payment.vo.enums.PGType
import io.madeformaid.webmvc.jpa.entity.BaseEntity
import io.madeformaid.webmvc.jpa.idGenerator.ShortId
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

/*
CASE 1. 사용자의 패스 구독
CASE 2. 카페의 제휴
* */
@Entity
@Table(name = "billing_key")
class BillingKeyEntity(
        @Id
        @ShortId
        var id: String? = null,

        @Column(name = "user_id")
        val userId: String? = null,

        @Column(name = "shop_id")
        val shopId: String? = null,

        @Column(name = "billing_type", nullable = false, columnDefinition = "varchar(100)")
        @Enumerated(EnumType.STRING)
        val billingType: BillingType,

        @Column(name = "billing_key", nullable = false)
        val billingKey: String,

        @Column(name = "customer_key", nullable = false)
        val customerKey: String,

        @Column(name = "issuer", nullable = false, columnDefinition = "varchar(100)")
        @Enumerated(EnumType.STRING)
        val issuer: PGType,

        @Column(name = "authenticated_at")
        val authenticatedAt: LocalDateTime,

        @Column(name = "disabled_at")
        val disabledAt: LocalDateTime? = null,

        @Column(name = "raw_response", columnDefinition = "jsonb")
        val rawResponse: String,
) : BaseEntity() {
        // for JPA
        protected constructor() : this(
                id = null,
                billingKey = "",
                customerKey = "",
                authenticatedAt = LocalDateTime.now(),
                issuer = PGType.TOSS,
                rawResponse = "",
                billingType = BillingType.USER_SHOP_PASS,
        )
}
