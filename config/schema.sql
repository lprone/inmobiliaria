DROP TABLE IF EXISTS users;
CREATE TABLE users(
  id  int(11) NOT NULL  auto_increment PRIMARY KEY,
  email VARCHAR(60),
  first_name VARCHAR(56),
  last_name VARCHAR(56)
);

DROP TABLE IF EXISTS inmoapp_development.Inmobiliarias;
CREATE TABLE inmoapp_development.Inmobiliarias (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL DEFAULT '',
  direccion VARCHAR(45) NOT NULL DEFAULT '',
  altura int(10) unsigned NOT NULL DEFAULT '0',
  barrio VARCHAR(45) NOT NULL DEFAULT '',
  ciudad VARCHAR(45) NOT NULL DEFAULT '',
  telefono VARCHAR(45) NOT NULL DEFAULT '',
  email VARCHAR(45) NOT NULL DEFAULT '',
  URLweb VARCHAR(45) NOT NULL DEFAULT '',
  PRIMARY KEY(id)
);

