CREATE TABLE Cliente
(
	id				INT 			PRIMARY KEY AUTO_INCREMENT,
	rut				INT			NOT NULL,
	dv				VARCHAR(1)		NOT NULL,
	nombre			VARCHAR(50)		NOT NULL,
	direccion		VARCHAR(50)		NOT NULL,
	correo			VARCHAR(50)		NOT NULL,
	
	comuna			VARCHAR(50)		NOT NULL,
	telefono		VARCHAR(50)		NOT NULL,
	esEmpresa		TINYINT			NOT NULL,
	UNIQUE(rut)
);


CREATE TABLE Medico
(
	id				INT 		PRIMARY KEY AUTO_INCREMENT,
	rut				INT		NOT NULL,
	dv				VARCHAR(1)	NOT NULL,
	nombre			VARCHAR(50)	NOT NULL,
	direccion		VARCHAR(50)	NOT NULL,
	correo			VARCHAR(50)	NOT NULL,
	
	especialidad	VARCHAR(50)	NOT NULL,
	UNIQUE(rut)
);


CREATE TABLE Mascota
(
	idMascota			INT 			PRIMARY KEY AUTO_INCREMENT,
	codigoChip			VARCHAR(50)		NOT NULL,
	nombre				VARCHAR(50)		NOT NULL,
	rutCliente			INT				NOT NULL,
	fechaNacimiento		VARCHAR(10)		NOT NULL,
	especie				VARCHAR(50)		NOT NULL,
	raza				VARCHAR(50)		NOT NULL,
	descripcion			VARCHAR(100)	NOT NULL,
	UNIQUE(patente)
);

CREATE TABLE Atencion
(
	idAtencion			INT 			PRIMARY KEY AUTO_INCREMENT,
	fecha				VARCHAR(10)		NOT NULL,
	rutMedico			INT				NOT NULL,
	codigoChip			INT				NOT NULL,
	procedimiento		VARCHAR(900)	NOT NULL,
	observaciones		VARCHAR(900)	NOT NULL,
	valor				INT				NOT NULL
);


-- PUEDE APLICAR CUALQUIER CAMBIO QUE ESTIME CONVIENTE Y QUE PERMITA
-- RESOLVER LA PROBLEMATICA PLANTEADA EN EL CASO DADO.