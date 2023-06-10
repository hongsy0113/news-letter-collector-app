package com.yooni.newsletter.domain.entity

import com.yooni.newsletter.domain.AuditEntity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class NewsLetterArticle(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_letter_article_id")
    val id: Long? = null,
    val externalId: String,
    val newsLetterExternalId: String,
    val mailId: String,
    val content: String,
    val mailTitle: String,
    val mailSnippet: String,
    val uploadedDate: LocalDate,
    val receivedAt: LocalDateTime
) : AuditEntity()