-- Очистка таблиц (необязательно, если spring.jpa.hibernate.ddl-auto=create-drop)
DELETE FROM ACTIVE_CHAT;
DELETE FROM INCOME;
DELETE FROM SPEND;

-- Тестовые данные для ACTIVE_CHAT
INSERT INTO ACTIVE_CHAT (ID, CHAT_ID) VALUES
                                          (1, 123456789),
                                          (2, 987654321);

-- Тестовые данные для INCOMES
INSERT INTO INCOME (ID, CHAT_ID, INCOME) VALUES
                                              (1, 123456789, 1000.50),
                                              (2, 987654321, 2000.75);

-- Тестовые данные для SPEND
INSERT INTO SPEND (ID, CHAT_ID, SPEND) VALUES
                                           (1, 123456789, 500.25),
                                           (2, 987654321, 300.00);