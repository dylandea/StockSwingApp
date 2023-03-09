-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS Store;
CREATE DATABASE Store;
USE Store;

-- -----------------------------------------------------------------------------
-- - Construction de la table des product                               ---
-- -----------------------------------------------------------------------------

CREATE TABLE T_Product (
	IdProduct			int(4)		PRIMARY KEY AUTO_INCREMENT,
	Description				varchar(30)	NOT NULL,
	Brand					varchar(30)	NOT NULL,
	Price			float(8)	NOT NULL ,
	Category			varchar(30) NOT NULL
) ENGINE = InnoDB;

INSERT INTO T_Product ( Description, Brand, Price , Category) VALUES ( 'S9'     ,	'Samsung', 250			, 'SmartPhone');
INSERT INTO T_Product ( Description, Brand, Price , Category) VALUES ( 'S10'    ,	'Samsung', 350 		, 'SmartPhone');
INSERT INTO T_Product ( Description, Brand, Price , Category) VALUES ( 'Iphone 10',	'Apple',	500 ,  'SmartPhone');
INSERT INTO T_Product ( Description, Brand, Price , Category) VALUES ( 'F756U', 'Asus', 600 		,  'Laptop');
INSERT INTO T_Product ( Description, Brand, Price , Category) VALUES ( 'GalacyTab S7', 'Samsung', 250 			, 'Tablet');
INSERT INTO T_Product ( Description, Brand, Price , Category) VALUES ( 'Ipad Pro'      , 	'Apple',	750      , 'Tablet');
INSERT INTO T_Product ( Description, Brand, Price , Category) VALUES ( 'Canon Pixma'    , 'Canon', 65 			, 'Printer');


SELECT * FROM T_Product;

