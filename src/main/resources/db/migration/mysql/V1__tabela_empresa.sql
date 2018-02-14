CREATE TABLE EMPRESA (empresaID BIGINT(20) NOT NULL,
                                               nome          VARCHAR(255) NOT NULL,
                                               apelido VARCHAR(50) NOT NULL,
                                               tipoPessoa VARCHAR(50) NOT NULL,
                                               cpfcnpj VARCHAR(18) NOT NULL)
ENGINE=InnoDB DEFAULT CHARSET=utf8;
                                               
ALTER TABLE EMPRESA ADD PRIMARY KEY (empresaID);

ALTER TABLE EMPRESA MODIFY empresaID BIGINT(20) NOT NULL AUTO_INCREMENT;
                                               
                                               
                                               