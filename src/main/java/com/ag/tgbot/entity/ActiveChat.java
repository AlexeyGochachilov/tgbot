package com.ag.tgbot.entity;

import lombok.Data;

import javax.persistence.*;

@Data  //Для того, чтобы не писать геттеры/сеттеры
@Entity // Данный класс является JPA сущностью
@Table(name = "ACTIVE_CHAT") //И хранится в таблице ACTIVE_CHAT
public class ActiveChat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CHAT_ID")
    private Long chatId;
}
