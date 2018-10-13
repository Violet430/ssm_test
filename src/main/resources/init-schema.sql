use ssmtest;
create table category_(
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(30),
    PRIMARY KEY(id)
)DEFAULT CHARSET=UTF8;

insert into category_ values(null,"category1");
insert into category_ values(null,"category2");
insert into category_ values(null,"category3");
insert into category_ values(null,"category4");
insert into category_ values(null,"category5");

select * from category_