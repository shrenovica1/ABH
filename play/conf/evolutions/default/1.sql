# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "users" (
  id                            uuid not null,
  firstname                     varchar(255),
  lastname                      varchar(255),
  address                       varchar(255),
  phone                         varchar(255),
  email                         varchar(255),
  passwor                       varchar(255),
  is_admin                      boolean,
  constraint pk_users primary key (id)
);


# --- !Downs

drop table if exists "users" cascade;

