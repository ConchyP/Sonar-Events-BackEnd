
INSERT INTO users (username, password) 
VALUES ('sonarevents@gmail.com', '$2a$12$CpLpmTSK3LqKcVcD/wJaj.URGybXR0fCtLnNynPvwlNQDJT8NGH.O');

/* USERS TABLE */
INSERT INTO users (username, password) VALUES
('user2@example.com', 'password456');

/*ROLES*/
INSERT INTO roles (id_role, name) VALUES (default, 'ROLE_USER');
INSERT INTO roles (id_role, name) VALUES (default, 'ROLE_ADMIN');

/* Users */
INSERT INTO users (id, username, password) VALUES (default, 'pepe', '$2a$12$8LegtLQWe717tIPvZeivjuqKnaAs5.bm0Q05.5GrAmcKzXw2NjoUO');
INSERT INTO users (id, username, password) VALUES (default, 'pepa', '$2a$12$8LegtLQWe717tIPvZeivjuqKnaAs5.bm0Q05.5GrAmcKzXw2NjoUO');

/*EVENTS TABLE */
INSERT INTO events (title, date, available, past, max_participants, registered_participants, description, image) VALUES
('Concierto de Rock', '2024-09-15 20:00:00', 'Gijón', 1, 0, 100, 25, 'Un emocionante concierto de rock con varias bandas locales.', 'rock_concierto.jpg'),
('Festival de Música Electrónica', '2024-09-20 22:00:00', 'Oviedo', 1, 0, 500, 450, 'Un festival con los mejores DJs de la escena electrónica.', 'electronica_festival.jpg'),
('Concierto de Música Clásica', '2024-12-12 20:00:00', 'Avilés', 1, 0, 200, 150, 'Una noche con las obras maestras de la música clásica.', 'musica_clasica.jpg');


INSERT INTO roles_users (role_id, user_id) VALUES (1, 1);
INSERT INTO roles_users (role_id, user_id) VALUES (2, 2);
