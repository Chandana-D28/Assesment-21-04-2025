create table Students(
id serial primary key,
name varchar(30) not null,
email varchar(30) unique,
age int,
marks decimal(10,2)
);

-- 1 question 
insert into Students values(101,'Chandana','chandu@gmail.com',21,98);
insert into Students values(102,'Ranjitha','ranju@gmail.com',22,95);
insert into Students values(103,'ChanduShree','shree@gmail.com',20,91);
insert into Students values(5,'Bindu','Bindu@gmail.com',25,90);
insert into Students values(6,'manoj','manoj@gmail.com',17,88);

select * from Students
-- second question 
select * from Students where age>21

-- third question 
update Students set email='rahul@gmail.com' where id=5
select * from Students

-- fourth question
delete from Students where age<18
select * from Students

-- fifth question 
select * from Students limit 1 offset 1

create table students2(
student_id int primary key,
name varchar(30),
age int
);

create table courses(
course_id int primary key,
course_name varchar(30),
student_id int,
foreign key (student_id) references students2(student_id)
)

insert into students2 values(1,'rahul',22);
insert into students2 values(2,'priya',21);
insert into students2 values(3,'Aakash',23);

insert into courses values(101,'Java',1);
insert into courses values(102,'Python',2);
insert into courses values(103,'SQL',1);

select s.name,c.course_name from students2 s inner join courses c on s.student_id=c.student_id;

