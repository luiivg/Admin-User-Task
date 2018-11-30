/*insert to Dependency*/
INSERT INTO dependency(name) VALUES('CONSULTORIA');
INSERT INTO dependency(name) VALUES('FABRICA');
INSERT INTO dependency(name) VALUES('DESARROLLO');

/*insert to Profile*/
INSERT INTO role(name) VALUES('ADMINISTRADOR');
INSERT INTO role(name) VALUES('CONSULTA');
INSERT INTO role(name) VALUES('OPERADOR');

/*insert to Task*/
INSERT INTO task(name) VALUES('tarea1');
INSERT INTO task(name) VALUES('tarea2');
INSERT INTO task(name) VALUES('tarea3');
INSERT INTO task(name) VALUES('tarea4');
INSERT INTO task(name) VALUES('tarea5');

/*insert to Row*/
INSERT INTO file(duration, task_id) VALUES('3',1);
INSERT INTO file(duration, task_id) VALUES('6',2);
INSERT INTO file(duration, task_id) VALUES('10',3);
INSERT INTO file(duration, task_id) VALUES('4',4);
INSERT INTO file(duration, task_id) VALUES('8',5);

/*insert to user*/
INSERT INTO user(active, birthdate, name, dependency_id, profile_id, row_id) values(true, '1994/11/10', 'luisa vargas',1,1,1);
INSERT INTO user(active, birthdate, name, dependency_id, profile_id, row_id) values(false, '1995/01/09', 'Alejandro Marin',1,2,2);
INSERT INTO user(active, birthdate, name, dependency_id, profile_id, row_id) values(false, '1995/03/31', 'Julia Mazo',2,3,2);

