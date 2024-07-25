USE my_db;
CREATE TABLE employees (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  surname varchar(25),
  department varchar(20),
  salary int,
  PRIMARY KEY (id)
) ;

INSERT INTO my_db.employees (name, surname, department, salary)
VALUES
	('Roman', 'Petrov', 'IT', 500),
	('Oleg', 'Goracho', 'IT', 1500),
	('Nina', 'Sidorova', 'HR', 850),
    ('Marina', 'Nikonorova', 'Sales', 1150);

