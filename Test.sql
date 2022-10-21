BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Test" (
	"ad"	TEXT,
	"tel"	TEXT
);
INSERT INTO "Test" VALUES ('ali','1222');
INSERT INTO "Test" VALUES ('','');
INSERT INTO "Test" VALUES ('w','');
INSERT INTO "Test" VALUES ('r','');
INSERT INTO "Test" VALUES ('t','');
INSERT INTO "Test" VALUES ('66','');
INSERT INTO "Test" VALUES ('sengul','bayrak');
INSERT INTO "Test" VALUES ('ee','ee');
INSERT INTO "Test" VALUES ('Ali','12345');
INSERT INTO "Test" VALUES ('Mustafa','1223444');
COMMIT;
