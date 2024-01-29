-- Active: 1706205769736@@127.0.0.1@222@main
CREATE TABLE anamnese_adulto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    tipo_atendimento ENUM('avaliacao', 'orientacao') NOT NULL,
    data_nascimento DATE NOT NULL,
    idade TINYINT UNSIGNED,
    sexo ENUM('masculino', 'feminino', 'nao_informado') NOT NULL,
    cidade VARCHAR(255) NOT NULL,
    bairro VARCHAR(255) NOT NULL,
    escolaridade ENUM('fundamental_completo', 'ensino_medio_completo', 'ensino_superior_incompleto', 'ensino_superior_completo', 'outra') NOT NULL,
    periodo_estudo ENUM('manha', 'tarde', 'noite', 'NA') NOT NULL,
    lanche_estudo BOOLEAN NOT NULL,
    periodo_trabalho ENUM('manha', 'tarde', 'noite', 'NA') NOT NULL,
    lanche_trabalho BOOLEAN NOT NULL,
    profissao VARCHAR(60) NOT NULL,
    data_atendimento DATE NOT NULL
);
