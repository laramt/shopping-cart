INSERT INTO restaurant (id, name, email, phone_number, adress) VALUES
(1L, 'Restaurant 1', 'email@email.com', '35 999 56433', 'Rua um apt dois'),
(2L, 'Restaurant 1', 'email@email.com', '35 999 56433', 'Rua um apt dois');

INSERT INTO client (id, name, email, phone_number, birth_date, adress) VALUES
(1L, 'LULU', 'emaillu@email.com', '35 999 564533', '23/07/1999', 'Rua dois apt dois');

INSERT INTO product (id, name, unitValue, available, restaurant_id) VALUES
(1L,'Produto 1', 5.0, true, 1L),
(2L,'Produto 2', 6.0, true, 1L),
(3L,'Produto 3', 7.0, true, 2L);

INSERT INTO cart (id, payment_options, closed, total_value, client_id) VALUES
(1L, 0, false, 0.0, 1L);