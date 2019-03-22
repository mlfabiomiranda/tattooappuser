CREATE TABLE user_entity (
    id        bigint CONSTRAINT firstkey PRIMARY KEY,
    name       varchar(100) NOT NULL
);

INSERT INTO user_entity (id, name) VALUES (1, 'fmiranda');
INSERT INTO user_entity (id, name) VALUES (2, 'fmg');