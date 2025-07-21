package com.ag.tgbot.repository;

import com.ag.tgbot.entity.Spend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {

    List<Spend> findByChatId(long l);

    @Query("SELECT SUM(s.spend) FROM Spend s")
    BigDecimal getTotalSpend();
}
