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
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'I7'     ,	'Intel', 499			, 'Processor', 3 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'I5'    ,	'Intel', 249 		, 'Processor', 9 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity) VALUES ( 'I3',	'Intel',	49 ,  'Processor', 27 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'Pentium', 'Intel', 2 		,  'Processor', 999 );
INSERT INTO T_Product ( Description, Brand, Price , Category , Quantity ) VALUES ( 'RTX 4090 Ti', 'Nvidia', 9999 			, 'Graphic Card', 1 );
INSERT INTO T_Product ( Description, Brand, Price , Category , Quantity ) VALUES ( 'RTX 3090'      , 	'Nvidia',	800      , 'Graphic Card', 40 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity  ) VALUES ( 'AMD RTX 7900'    , 'Radeon', 149 			, 'Graphic Card', 40 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'Webcam'     ,	'Logitech', 79			, 'Webcam', 30 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'TV 8K'    ,	'LG', 2499 		, 'TV', 3 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity) VALUES ( 'TV 4K',	'Samsung',	499 ,  'TV', 50 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'Nokia G20', 'Nokia', 39 		,  'SmartPhone', 4569 );
INSERT INTO T_Product ( Description, Brand, Price , Category , Quantity ) VALUES ( 'Nokia 5310', 'Nokia', 299 			, 'SmartPhone', 80 );
INSERT INTO T_Product ( Description, Brand, Price , Category , Quantity ) VALUES ( 'L480'      , 	'Lenovo',	480      , 'PC', 64 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity  ) VALUES ( 'RTED2892NND'    , 'Realtek', 499 			, 'Camera', 15 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'Suite Microsoft office'     ,	'Microsoft', 149			, 'Software', 100 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'Tune 230 NC TWS'    ,	'JBL', 69 		, 'Headphones', 32 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity) VALUES ( 'MDR-ZX110B',	'Sony',	15 ,  'Headphones', 50 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity ) VALUES ( 'Ultra Thin Outlet', 'Sleek Socket', 19 		,  'Multi outlet', 50 );
INSERT INTO T_Product ( Description, Brand, Price , Category , Quantity ) VALUES ( 'Redmi Note 11', 'Xiaomi', 249 			, 'Mobile', 75 );
INSERT INTO T_Product ( Description, Brand, Price , Category , Quantity ) VALUES ( 'CD+R'      , 	'Emtec',	9      , 'CD/DVD', 100 );
INSERT INTO T_Product ( Description, Brand, Price , Category, Quantity  ) VALUES ( 'Screen 23'' LED FHD'    , 'Dell', 99 			, 'Screen', 123 );


SELECT * FROM T_Product;

