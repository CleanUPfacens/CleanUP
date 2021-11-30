drop database if exists cleanup;
create database cleanup;
use cleanup;
/*  
Alguns varchar estão nos lugares de variaveis que ainda não tenho conhecimento como foto* ou anexo de documento*  
*/ 
create table prestadorfisico(
id_prestadorfisico       int auto_increment primary key,
nome_prestadorfisico     varchar(80),
data_de_nascimento       varchar(60),
Sexo_prestadorfisico     varchar(80),
CPF_prestadorfisico      varchar(80),
Celular_prestadorfisico  varchar(80),
Email_prestadorfisico    varchar(80),
Foto_prestadorfisico    MEDIUMBLOB,
Senha_prestadorfisico    varchar(80),
CEP_prestadorfisico      varchar(80),
Logradouro_prestadorfisico  varchar(80),
Número_prestadorfisico      int,
Complemento_prestadorfisico varchar(80),
Bairro_prestadorfisico varchar(80),
Estado_prestadorfisico varchar(80),
Cidade_prestadorfisico varchar(80)
);
/*  
Alguns varchar estão nos lugares de variaveis que ainda não tenho conhecimento como foto* ou anexo de documento*  
*/ 
create table prestadorjuridico(
id_prestadorjuridico       int auto_increment primary key,
nome_prestadorjuridico     varchar(80),
data_de_nascimento_prestadorjuridico       varchar(60),
Sexo_prestadorjuridico     varchar(80),
CPF_prestadorjuridico      varchar(80),
Celular_prestadorjuridico  varchar(80),
Email_prestadorjuridico    varchar(80),
Foto_prestadorjuridico     MEDIUMBLOB,
Senha_prestadorjuridico   varchar(80),
CEP_prestadorjuridico       varchar(80),
Logradouro_prestadorjuridico   varchar(80),
Número_prestadorjuridico       int,
Complemento_prestadorjuridico  varchar(80),
Bairro_prestadorjuridico  varchar(80),
Estado_prestadorjuridico  varchar(80),
Cidade_prestadorjuridico  varchar(80)
);
/*  
Alguns varchar estão nos lugares de variaveis que ainda não tenho conhecimento como foto* ou anexo de documento*  
*/ 
create table portifoliofisico(
Categoria_de_serviço_prestado varchar(80),
Fotos_dos_antes_e_depois      MEDIUMBLOB,
Documento                     MEDIUMBLOB,
id_prestadorfisicooo          int,
foreign key(id_prestadorfisicooo) references prestadorfisico(id_prestadorfisico)
);
/*  
Alguns varchar estão nos lugares de variaveis que ainda não tenho conhecimento como foto* ou anexo de documento*  
*/ 
create table portifoliojuridico(
Categoria_de_serviço_prestado varchar(80),
Fotos_dos_antes_e_depois      MEDIUMBLOB,
Documento                     MEDIUMBLOB,
id_prestadorjuridicooo        int,
foreign key(id_prestadorjuridicooo) references prestadorjuridico(id_prestadorjuridico)
);
/*  
Alguns varchar estão nos lugares de variaveis que ainda não tenho conhecimento como foto* ou anexo de documento*  
*/ 
create table consumidor(
id          int auto_increment primary key,.
Nome_Completo varchar(80),
Foto MEDIUMBLOB,
Sexo varchar(80),
CPF varchar(80),
Email varchar(80),
Senha varchar(80),
CEP varchar(80),
Logradouro varchar(80),
Número int,
Complemento varchar(80),
Bairro varchar(80),
Estado varchar(80),
Cidade varchar(80)
);

create table Pagamento(
id_pagamento          int auto_increment primary key,
endereco_pagamento    varchar(80),
Foto_pagamento        MEDIUMBLOB,
tipo_pagamento        varchar(80),
dataehora_pagamento   varchar(80),
complemento           varchar(80),
descricao_do_pedido   varchar(80),
chavestrangeira_consumidor int,
foreign key(chavestrangeira_consumidor) references consumidor(id)
);