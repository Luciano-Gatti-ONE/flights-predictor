create table response (

    id bigint not null auto_increment,
    prevision varchar(50) not null,
    probability double not null,
    status varchar(50) not null,

    primary key(id)

);