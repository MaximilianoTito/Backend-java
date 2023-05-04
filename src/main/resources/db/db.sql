Necesito poder almacenar productos y los mismos que se va a clasificar por categoria y 
poder visualizar los precio,cantidad, descripcion,ver si esta activo o desactivo.

CREATE TABLE onlineshop.product (
	id_product SERIAL NOT NULL,
	name VARCHAR (50),
	price DECIMAL,
	quantity INT,
	archived BOOL DEFAULT True
);

-- DROP TABLE onlineshop.product;

ALTER TABLE	onlineshop.product
ADD	PRIMARY KEY (id_product);

INSERT INTO onlineshop.product (name, price, quantity, archived)
VALUES ('Audifonos', 5, 100, TRUE);