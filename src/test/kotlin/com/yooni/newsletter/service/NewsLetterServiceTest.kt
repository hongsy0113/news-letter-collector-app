package com.yooni.newsletter.service

import com.yooni.newsletter.domain.entity.NewsLetterInfo
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
class NewsLetterServiceTest @Autowired constructor(
    private val newsLetterService: NewsLetterService
) {
    @Test
    fun `news letter 정보를 저장하고 조회할 수 있다`() {
        // given

        // when
        val savedNewsLetterInfo = newsLetterService.addNewsLetterInfo(
            labelId = "testLabelId",
            name = "testName",
            url = "testUrl",
            description = "testDescription"
        )
        val actual = newsLetterService.getNewsLetterInfo(externalId = savedNewsLetterInfo.externalId)

        // then
        savedNewsLetterInfo shouldNotBe null
        actual shouldNotBe null
        actual!! shouldBe savedNewsLetterInfo

    }
}
