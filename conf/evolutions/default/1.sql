# Tasks schema

# --- !Ups

CREATE SEQUENCE task_id_seq;
CREATE TABLE task (
    id integer NOT NULL DEFAULT nextval('task_id_seq'),
    title varchar(255),
    description varchar(255),
    createdOn timestamp,
    dueOn timestamp,
    occurrence varchar(255) check (occurrence in ('Daily', 'Weekly', 'Monthly', 'Once')),
    alarm varchar(255) check (alarm in ('Beep', 'Email', 'None'))
);

# --- !Downs

DROP TABLE task;
DROP SEQUENCE task_id_seq;
