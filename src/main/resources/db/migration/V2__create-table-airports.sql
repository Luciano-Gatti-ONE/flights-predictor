create table airports (

    id bigint not null  auto_increment,
    country_name varchar(20),
    city_name varchar(50) not null,
    airport_name varchar(150) not null,
    airport_iata char(3) unique,
    city_iata char(3) unique,
    latitude decimal(9.6) not null,
    longitude decimal(9.6) not null,
    timezone varchar(50) not null,

    primary key(id)

);