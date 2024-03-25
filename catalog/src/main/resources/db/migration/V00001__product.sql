create sequence seq_product;

create table product(
    id bigint not null,
    name varchar(50),
    price real,
    constraint fk_product primary key(id)
);