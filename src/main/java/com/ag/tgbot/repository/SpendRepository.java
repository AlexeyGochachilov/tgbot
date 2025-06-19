package com.ag.tgbot.repository;

import com.ag.tgbot.entity.Spend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}
