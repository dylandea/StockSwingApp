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

INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'S87544'     ,	'Samsung', 250			, 'SmartPhone' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'S10'    ,	'Samsung', 350 		, 'SmartPhone' );
INSERT INTO T_Product ( Description, Brand, Price , Category) VALUES ( 'Iphone 10',	'Apple',	500 ,  'SmartPhone' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'F756U', 'Asus', 600 		,  'Laptop' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Ipad Pro'      , 	'Apple',	750      , 'Tablet' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Canon Pixma'    , 'Canon', 65 			, 'Printer' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'I7'     ,	'Intel', 499			, 'Processor' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'I5'    ,	'Intel', 249 		, 'Processor' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'I3',	'Intel',	49 ,  'Processor' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Pentium', 'Intel', 2 		,  'Processor' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'RTX 4090 Ti', 'Nvidia', 9999 			, 'Graphic Card' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'RTX 3090'      , 	'Nvidia',	800      , 'Graphic Card' );
INSERT INTO T_Product ( Description, Brand, Price , Category  ) VALUES ( 'AMD RTX 7900'    , 'Radeon', 149 			, 'Graphic Card' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Webcam'     ,	'Logitech', 79			, 'Webcam' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'TV 8K'    ,	'LG', 2499 		, 'TV' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'TV 4K',	'Samsung',	499 ,  'TV' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Nokia G20', 'Nokia', 39 		,  'SmartPhone' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Nokia 5310', 'Nokia', 299 			, 'SmartPhone' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'L480'      , 	'Lenovo',	480      , 'PC' );
INSERT INTO T_Product ( Description, Brand, Price , Category  ) VALUES ( 'RTED2892NND'    , 'Realtek', 499 			, 'Camera' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Suite Microsoft office'     ,	'Microsoft', 149			, 'Software' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Tune 230 NC TWS'    ,	'JBL', 69 		, 'Headphones' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'MDR-ZX110B',	'Sony',	15 ,  'Headphones' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Ultra Thin Outlet', 'Sleek Socket', 19 		,  'Multi outlet' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Redmi Note 11', 'Xiaomi', 249 			, 'Mobile' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'CD+R'      , 	'Emtec',	9      , 'CD/DVD' );
INSERT INTO T_Product ( Description, Brand, Price , Category ) VALUES ( 'Screen 23'' LED FHD'    , 'Dell', 99 			, 'Screen' );


SELECT * FROM T_Product;

