CREATE TABLE PERSONA
(
    IDPERSONA           INT         PRIMARY KEY AUTO_INCREMENT,
    RUT                 VARCHAR(10) NOT NULL,
    NOMBRE              VARCHAR(50) NOT NULL,
    APELLIDO            VARCHAR(50) NOT NULL,
    DIRECCION           VARCHAR(90) NOT NULL,
    UNIQUE(RUT)
);

CREATE TABLE ADMINISTRATIVO
(
    IDADMINISTRATIVO    INT             PRIMARY KEY AUTO_INCREMENT,
    RUT                 INT             NOT NULL,
    NOMBRE              VARCHAR(50)     NOT NULL,
    APELLIDO            VARCHAR(50)     NOT NULL,
    EDAD                INT             NOT NULL,
    ALTURA              DECIMAL(3,2)    NOT NULL,
    GENERO              VARCHAR(1)      NOT NULL,
    SUELDO              INT             NOT NULL,
    UNIQUE(RUT)
)