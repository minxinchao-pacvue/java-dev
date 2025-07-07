
CREATE DATABASE test;

\c test;

create table public.student
(
    id   serial
        primary key,
    name text,
    age  integer
);

alter table public.student
    owner to postgres;

INSERT INTO public.student (name,age)
VALUES ('John',12),
       ('Jane',1),
       ('Doe',3);

create table public.toy
(
    id   serial
        primary key,
    student_id integer,
    name text
);


create table public.company
(
    id   serial
        primary key,
    name text,
    city text,
    secret text
);


alter table public.toy
    owner to postgres;

INSERT INTO public.toy (student_id,name)
VALUES (1,'plane'),
       (1,'rocket'),
       (2,'car');

alter table public.company
    owner to postgres;


INSERT INTO  public.company (name,city,secret)
VALUES ('Company A','City X','[{"money":"1000"}]'),
       ('Company B','City Y','[{"money":"2000"}]'),
       ('Company C','City Z','[{"money":"3000"}]');