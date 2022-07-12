/*creates tabels for the database*/
CREATE TABLE Artist(
                       artistid serial not null,
                       ArtistName varchar (60),
                       Startdate date,
                       enddate date,
                       primary key (artistid)
);

create table vinyl(
                      vinylid serial,
                      artistid int,
                      releaseyear date,
                      genre varchar(60),
                      country varchar(60),
                      primary key (vinylid),
                      foreign key (artistid) references Artist(artistid)
);

Create table users (
                       userid  serial,
                       username varchar(60),
                       fname varchar(60),
                       email varchar(80),
                       passord varchar(90),
                       primary key (userid)
);
create table collections (
                             collectid serial,
                             userid int not null ,
                             vinyl int not null ,
                             primary key (collectid),
                             foreign key (userid) references users(userid),
                             foreign key (vinyl) references vinyl(vinylid)
);