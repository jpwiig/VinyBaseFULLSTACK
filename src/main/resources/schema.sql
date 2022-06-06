CREATE TABLE Artist(
    artistid int auto_increment not null,
    ArtistName varchar (60),
    Startdate date,
    enddate date,
    primary key (ArtistName)
);

create table vinyl(
    vinylid int auto_increment,
    ArtistName varchar(60),
    releaseyear year,
    genre varchar(60),
    country varchar(60),
    primary key (vinylid),
    foreign key (ArtistName) references Artist(artistid)
);

Create table user (
    userid  int auto_increment not null ,
    username varchar(60),
    name varchar(60),
    email varchar(80),
    passord varchar(90)

);
create table collections (
    collectid int auto_increment not null,
    userid int not null ,
    vinyl int not null ,
    primary key (collectid),
    foreign key (userid) references user(userid),
    foreign key (vinyl) references vinyl(vinylid)
);
