create sequence seq_category;

create table category(
    id bigint not null,
    name varchar(50),
    constraint pk_category primary key (id)
);

alter table product add column category_id bigint;
alter table product add constraint fk_product_category
    foreign key (category_id) references category(id);

