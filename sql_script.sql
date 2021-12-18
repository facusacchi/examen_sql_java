create database examen;

create table poliza (id int, cliente_id int, desde date, hasta date);
create table cliente (id int, name varchar(45));

insert into poliza values (1001, 81, '2020-01-01', '2020-07-01');
insert into poliza values (1004, 82, '2020-07-01', '2020-12-31');
insert into poliza values (1004, 82, '2020-12-31', '2021-07-01');
insert into poliza values (1009, 83, '2019-08-01', '2020-02-03');
insert into poliza values (1009, 83, '2020-02-03', '2020-08-03');
insert into poliza values (1009, 83, '2020-08-03', '2021-02-03');
insert into cliente values (81, 'juan');
insert into cliente values (82, 'pedro');
insert into cliente values (83, 'raul');

# 1
select p.id id, c.name name 
from poliza p
inner join Cliente c
on p.cliente_id = c.id
group by p.id
order by p.id;

# 2
select c.name cliente, p.desde fecha_desde 
from poliza p
inner join Cliente c
on p.cliente_id = c.id
group by c.name;

# 3
select p.id, count(p.id) cantidad, c.name nombre_cliente, max(p.hasta) reciente
from poliza p
inner join Cliente c
on p.cliente_id = c.id
group by p.id
having cantidad > 1;