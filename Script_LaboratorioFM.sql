create database FilmMagic;
use FilmMagic;

create table Empleado
(
  Codigo_Empleado int PRIMARY KEY not null,
  DPI_Empleado varchar(11) not null,
  Nombre_Empleado varchar(50) not null,
  Apellido_Empleado varchar(50) not null,
  Telefono_Empleado varchar(10) not null,
  Correo_Empleado varchar(80) not null,
  Genero_Empleado varchar(1) not null,
  Estado_Empleado varchar(1) not null
)Engine= InnoDB, default char set= latin1;

create table Cliente
(
  Codigo_Cliente int PRIMARY KEY,
  DPI_Cliente varchar(11) not null,
  Nombre_Cliente varchar(50) not null,
  Apellido_Cliente varchar(50) not null,
  Telefono_Cliente varchar(10) not null,
  Correo_Cliente varchar(80) not null,
  
  Codigo_Empleado int not null,
  foreign key (Codigo_Empleado) references Empleado(Codigo_Empleado)
)Engine= InnoDB, default char set= latin1;

create table Autor
(
  Codigo_Autor int PRIMARY KEY,
  Nombre_Autor varchar(50) not null,
  Apellido_Autor varchar(50) not null
)Engine= InnoDB, default char set= latin1;

create table Producto
(
  Codigo_Producto int PRIMARY KEY,
  Nombre_Producto varchar(50) not null,
  Precio_Producto FLOAT not null,
  Tipo_Producto varchar(45) not null,
  Existencias_Producto int not null,
  
  Codigo_Autor int,
  foreign key(Codigo_Autor) references Autor(Codigo_Autor)
)Engine= InnoDB, default char set= latin1;

select *from Empleado;