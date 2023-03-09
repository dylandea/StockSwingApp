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
	Category			varchar(30) NOT NULL,
	Quantity				int(4) NOT NULL
) ENGINE = InnoDB;

INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'S9'     ,	'Samsung', 250			, 'SmartPhone', 10 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'S10'    ,	'Samsung', 350 		, 'SmartPhone', 5 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity) VALUES ( 'Iphone 10',	'Apple',	500 ,  'SmartPhone', 2 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'F756U', 'Asus', 600 		,  'Laptop', 15 );
INSERT INTO T_Product ( Description, Brand, Price , Category , Quantity ) VALUES ( 'GalacyTab S7', 'Samsung', 250 			, 'Tablet', 20 );
INSERT INTO T_Product ( Description, Brand, Price , Category , Quantity ) VALUES ( 'Ipad Pro'      , 	'Apple',	750      , 'Tablet', 20 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity  ) VALUES ( 'Canon Pixma'    , 'Canon', 65 			, 'Printer', 50 );


SELECT * FROM T_Product;

