CREATE DATABASE db_ifpr;

USE db_ifpr;

CREATE TABLE tb_usuario (
    id INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    cpf CHAR(14) NOT NULL,
    data_nascimento DATE,
    sexo ENUM ('FEMININO','MASCULINO','OUTRO'),
    CONSTRAINT pk_tb_usuario PRIMARY KEY(id)
);

CREATE TABLE tb_produto (
    id INT AUTO_INCREMENT,
    nome VARCHAR(70) NOT NULL,
    marca VARCHAR(70) NOT NULL,
    data_fabricacao DATE NOT NULL,
    preco DOUBLE NOT NULL,
    CONSTRAINT pk_tb_produto PRIMARY KEY(id)
);
