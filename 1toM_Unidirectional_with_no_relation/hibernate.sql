
create table student(studentId INT PRIMARY KEY AUTO_INCREMENT , studentName VARCHAR(45), studentAge INT)

create table course(courseId INT PRIMARY KEY AUTO_INCREMENT, courseName VARCHAR(45), courseFee INT)


create table student_course_mapping(id INT PRIMARY KEY AUTO_INCREMENT, studentId INT , courseId INT)
alter table student_course_mapping add foreign key (studentId) references student(studentId)
alter table student_course_mapping add foreign key (courseId) references course(courseId)