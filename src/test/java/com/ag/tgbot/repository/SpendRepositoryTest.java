package com.ag.tgbot.repository;

import com.ag.tgbot.entity.Spend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class SpendRepositoryTest {

    @Autowired
    private SpendRepository spendRepository;

    @Test
    void shouldFindByChatId() {

        List<Spend> spends = spendRepository.findByChatId(123456789L);

        assertEquals(1, spends.size());
        assertEquals(0, new BigDecimal("500.25").compareTo(spends.get(0).getSpend()));
        assertEquals(123456789L, spends.get(0).getChatId());
    }

    @Test
    void shouldCalculateTotalSpend() {

        BigDecimal total = spendRepository.getTotalSpend();
        assertNotNull(total, "Total spend should not be null");
        assertEquals(0, new BigDecimal("800.25").compareTo(total));
    }

    @Test
    void shouldFindNoSpendsForNewChat() {

        List<Spend> spends = spendRepository.findByChatId(111111111L);
        assertTrue(spends.isEmpty());
    }
}
