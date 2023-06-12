create database db_recyclerush;
use db_recyclerush;

create table tb_usuario (
	id int primary key auto_increment,
    nomeExibicao varchar(100) not null,
    score int,
    login varchar(100) not null unique,
    senha varchar(100) not null,
    perfil varchar(100) not null
);

insert into tb_usuario(nomeExibicao, login,  senha, perfil) 
values('Admin','admin',md5('admin'),'admin');

create table tb_lixo (
	idLixo int primary key auto_increment,
    nomeLixo varchar(100) not null,
	tipoLixo varchar(100) not null,
    imgLixo varchar(255) not null
);

create table tb_lixeira (
	idLixeira int primary key auto_increment,
    corLixeira varchar(100) not null,
    tipoLixeira varchar(100) not null,
    imgLixeira varchar(255) not null
);