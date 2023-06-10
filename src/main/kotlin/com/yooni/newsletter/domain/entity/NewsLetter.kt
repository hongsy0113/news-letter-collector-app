package com.yooni.newsletter.domain.entity

import com.yooni.newsletter.domain.AuditEntity
import com.yooni.newsletter.type.YesNoType
import javax.persistence.*

@Entity
data class NewsLetter(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_letter_id")
    val id: Long,
    val externalId: String,
    val labelId: String,
    val name: String,
    val url: String,
    val description: String,
    @Enumerated(EnumType.STRING)
    val monYn: YesNoType,
    @Enumerated(EnumType.STRING)
    val tueYn: YesNoType,
    @Enumerated(EnumType.STRING)
    val wedYn: YesNoType,
    @Enumerated(EnumType.STRING)
    val thuYn: YesNoType,
    @Enumerated(EnumType.STRING)
    val friYn: YesNoType,
    @Enumerated(EnumType.STRING)
    val satYn: YesNoType,
    @Enumerated(EnumType.STRING)
    val sunYn: YesNoType
) : AuditEntity()