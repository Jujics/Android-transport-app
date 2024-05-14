BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "demo" (
	"ID"	integer,
	"Name"	varchar(20),
	"Hint"	text,
	PRIMARY KEY("ID")
);
CREATE TABLE IF NOT EXISTS "Infos" (
	"Nom"	TEXT NOT NULL,
	"Code"	TEXT NOT NULL,
	PRIMARY KEY("Nom")
);
CREATE TABLE IF NOT EXISTS "Lignes desservies" (
	"Nom"	TEXT NOT NULL,
	"1ereligne"	TEXT NOT NULL,
	"2emeligne"	TEXT,
	"3emeligne"	TEXT,
	"4emeligne"	TEXT,
	"5emeligne"	TEXT,
	PRIMARY KEY("Nom")
);
INSERT INTO "demo" VALUES (1,'https://SQL.BanD','The most secure, fast, efficient web-sql client');
INSERT INTO "demo" VALUES (2,'SQL Online','Next gen SQL editor');
INSERT INTO "demo" VALUES (3,'Kirill N.','https://www.linkedin.com/in/sqliteonlinecom');
INSERT INTO "demo" VALUES (4,'Twitter','https://twitter.com/SqliteOnlineCom');
INSERT INTO "demo" VALUES (5,'Donate (ERC20: ETH or USDC) ','0xCcc227E5615D4FADd758228Bab12ceb465D4ED18');
INSERT INTO "demo" VALUES (6,'Donate (BTC)','bc1q25zqmgll2fz0tyduusyfageh3jh7htcwjt2rdk');
INSERT INTO "demo" VALUES (7,'Chart','LINE-SELECT name, cos(id), sin(id) FROM demo;');
INSERT INTO "demo" VALUES (8,'Short CODE','s* tableName => SELECT * FROM tableName
sf tableName => SELECT columns FROM tableName
sc tableName => SELECT count(*) FROM tableName
sl tableName => SELECT * FROM tableName ORDER BY key DESC LIMIT 100;
ct => CREATE TABLE
ii tableName => INSERT INTO
us tableName => UPDATE SET
uw tableName => UPDATE SET WHERE
df tableName => DELETE FROM
dw tableName => DELETE FROM WHERE');
INSERT INTO "demo" VALUES (9,'SqLite 3.40.0','SQL OnLine on JavaScript');
INSERT INTO "demo" VALUES (10,'[RightClick] mouse','Opens many additional features');
INSERT INTO "demo" VALUES (11,'Left-Panel, Table','[RightClick] mouse "Context menu"');
INSERT INTO "demo" VALUES (12,'Tabs','mouse: [RightClick] , [MiddleClick] , [Wheel] , [LeftClick]');
INSERT INTO "demo" VALUES (13,'SQL Editor','autocomplete: [Ctrl-Space] or [Alt-Space]; run: [Shift-Enter]');
INSERT INTO "demo" VALUES (14,'Size table','Fast scroll million rows');
INSERT INTO "demo" VALUES (15,'Share','Create public link DB');
INSERT INTO "demo" VALUES (16,'12','Number of color themes');
INSERT INTO "demo" VALUES (17,'ai.Url','https://sqliteonline.com/LICENSE');
INSERT INTO "demo" VALUES (18,'ai.Color','#9393ad');
INSERT INTO "demo" VALUES (19,'ai.Image','Blob - png, jpg, gif or String(base64) [DbClick] row');
INSERT INTO "demo" VALUES (20,'SQL','Syntax example library');
INSERT INTO "demo" VALUES (21,'CREATE','CREATE TABLE table_name (col1, col2)');
INSERT INTO "demo" VALUES (22,'SELECT','SELECT * FROM table_name');
INSERT INTO "demo" VALUES (23,'INSERT','INSERT INTO table_name (col1, col2) VALUES ("example","test")');
INSERT INTO "demo" VALUES (24,'UPDATE','UPDATE table_name SET col1="work" WHERE col2="test"');
INSERT INTO "demo" VALUES (25,'DELETE','DELETE FROM table_name');
INSERT INTO "Infos" VALUES ('Theatre','1');
INSERT INTO "Infos" VALUES ('Blanqueer','2');
INSERT INTO "Infos" VALUES ('Dessante givrée','5');
INSERT INTO "Infos" VALUES ('DTC','4');
INSERT INTO "Infos" VALUES ('Coeur','3');
INSERT INTO "Infos" VALUES ('Château','6');
INSERT INTO "Infos" VALUES ('Caverne de Satan','7');
INSERT INTO "Infos" VALUES ('Avenue des drapeaux','8');
INSERT INTO "Infos" VALUES ('Port','9');
INSERT INTO "Infos" VALUES ('Egarlest','18');
INSERT INTO "Infos" VALUES ('Sand City','17');
INSERT INTO "Infos" VALUES ('Polnareffland','16');
INSERT INTO "Infos" VALUES ('Phare','14');
INSERT INTO "Infos" VALUES ('Musée','10');
INSERT INTO "Infos" VALUES ('Licorne','11');
INSERT INTO "Infos" VALUES ('Forêt','12');
INSERT INTO "Infos" VALUES ('Trou','13');
INSERT INTO "Infos" VALUES ('Snowden','22');
INSERT INTO "Infos" VALUES ('Acerterdam','21');
INSERT INTO "Infos" VALUES ('Eaudonne','20');
INSERT INTO "Infos" VALUES ('Jardin des plantes','19');
INSERT INTO "Infos" VALUES ('Moche Room','26');
INSERT INTO "Infos" VALUES ('Chez Syd','27');
INSERT INTO "Infos" VALUES ('Pyramide','29');
INSERT INTO "Infos" VALUES ('Jump Arc-en-ciel','30');
INSERT INTO "Infos" VALUES ('Univercitée','28');
INSERT INTO "Infos" VALUES ('Bidonville','25');
INSERT INTO "Infos" VALUES ('Horny Jail','24');
INSERT INTO "Infos" VALUES ('Parc National de la Branche','23');
INSERT INTO "Infos" VALUES ('Préfecture','31');
INSERT INTO "Infos" VALUES ('Bry gare TGV','32');
INSERT INTO "Infos" VALUES ('Marché','33');
INSERT INTO "Infos" VALUES ('VTF sur Seine','34');
INSERT INTO "Infos" VALUES ('Val de ta G','35');
INSERT INTO "Infos" VALUES ('Marche','36');
INSERT INTO "Infos" VALUES ('Ecole primaire','37');
INSERT INTO "Infos" VALUES ('Hospital','38');
INSERT INTO "Infos" VALUES ('Trou 55000','100');
INSERT INTO "Infos" VALUES ('Haut du trou','39');
INSERT INTO "Infos" VALUES ('Canal','40');
INSERT INTO "Infos" VALUES ('Manoir','41');
INSERT INTO "Infos" VALUES ('Grand rue','42');
INSERT INTO "Infos" VALUES ('Gloomlight','43');
INSERT INTO "Infos" VALUES ('Chez Pierre','44');
INSERT INTO "Infos" VALUES ('Floating Iles','45');
INSERT INTO "Infos" VALUES ('Chez Raph','46');
INSERT INTO "Infos" VALUES ('Bridge City','47');
INSERT INTO "Infos" VALUES ('Avenue des monuments','15');
INSERT INTO "Infos" VALUES ('Porceville','51');
INSERT INTO "Infos" VALUES ('Outpost','50');
INSERT INTO "Infos" VALUES ('Suisse','49');
INSERT INTO "Infos" VALUES ('Chez Monokis','48');
INSERT INTO "Infos" VALUES ('La baie des bois','59');
INSERT INTO "Infos" VALUES ('Windenbourg central','53');
INSERT INTO "Infos" VALUES ('Lycée Magique George Pompidou','57');
INSERT INTO "Infos" VALUES ('HollyBoob','58');
INSERT INTO "Infos" VALUES ('INFP Windenbourg TER','52');
INSERT INTO "Infos" VALUES ('Centre commercial binaire','54');
INSERT INTO "Infos" VALUES ('Casino','55');
INSERT INTO "Infos" VALUES ('Ferme','56');
INSERT INTO "Infos" VALUES ('Musée Biomes','60');
INSERT INTO "Infos" VALUES ('non','100');
INSERT INTO "Infos" VALUES ('Château TGV','100');
INSERT INTO "Infos" VALUES ('Willow Creek','100');
INSERT INTO "Infos" VALUES ('Mer de Monstres','100');
INSERT INTO "Infos" VALUES ('Forêt Sud','100');
INSERT INTO "Infos" VALUES ('PM Japan Expo','100');
INSERT INTO "Infos" VALUES ('Mud Place','100');
INSERT INTO "Lignes desservies" VALUES ('Theatre','A','E',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Blanqueer','A','Navette plage',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Dessante givrée','A','',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('DTC','A','E',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Coeur','A','',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Château','A','','Tramway Château','B',NULL);
INSERT INTO "Lignes desservies" VALUES ('Caverne de Satan','A',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Avenue des drapeaux','A',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Port','A','C','D',NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Egarlest','B','Tramway Egarlest',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Sand City','B',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Polnareffland','B',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Phare','B',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Musée','B',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Licorne / avenue des monumants','B','C',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Forêt','B',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Trou','B','C','D','E','Tramway Trou');
INSERT INTO "Lignes desservies" VALUES ('Snowden','C','',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Acerterdam','C',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Eaudonne','C',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Jardin des plantes','C','Tramway Trou',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Moche Room','D',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Chez Syd','D',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Pyramide','D',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Jump Arc-en-ciel','D',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Univercitée','D','',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Bidonville','D',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Horny Jail','E',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Parc National de la Branche','E',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Préfecture','Tramway Château',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Bry','Tramway Château',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Marché','Tramway Château',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('VTF sur Seine','Tramway Château','TGV',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Val de ta G','Tramway Château','',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Marche','Tramway Trou',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Ecole primaire','Tramway Trou',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Hospital','Tramway Trou',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Trou 55000','Tramway Trou','C',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Haut du trou','Tramway Trou',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Canal','Tramway Egarlest',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Manoir','Tramway Egarlest',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Grand rue','Tramway Egarlest',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Gloomlight','Tramway Egarlest','V',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Chez Pierre','V','TER 1',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Floating Iles','V',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Chez Raph','V',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Bridge City','V','TER 2',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Windenbourg','TER 1',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Porceville','TER 1',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Outpost','TER 1','',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Suisse','TER 1',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Chez Monokis','TER 2','TGV',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('La baie des bois','Tu',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Gare TGV','Tu','O','TGV',NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Lycée Magique George Pompidou','Tu',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('HollyBoob','Tu',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('INFP','O',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Centre commercial binaire','O',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Casino','O',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Ferme','O',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Musée Biomes','TGV',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Windenbourg Central','TGV','O','Tu',NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Château TGV','TGV','Tramway Château',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Willow Creek','TGV',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Mer de Monstres','P','',NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Forêt Sud','P',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('PM Japan Expo','P',NULL,NULL,NULL,NULL);
INSERT INTO "Lignes desservies" VALUES ('Mud Place','P',NULL,NULL,NULL,NULL);
COMMIT;
