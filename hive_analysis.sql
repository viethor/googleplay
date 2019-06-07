--Data Digest & Exploration--
CREATE DATABASE IF NOT EXISTS googleplaystore_db;
USE googleplaystore_db;

DROP TABLE IF EXISTS googleplay0;
DROP TABLE IF EXISTS googleplay;

CREATE EXTERNAL TABLE googleplay0 (App STRING,
                        Category STRING, 
                        Rating DOUBLE,
                        Reviews INT,
                        AppSize STRING, 
                        Installs STRING,
                        Type STRING,
                        Price STRING,
                        ContentRating STRING, 
                        Genres STRING,
                        LastUpdated STRING,
                        CurrentVer STRING,
                        AndroidVer STRING)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '\t'
STORED AS TEXTFILE
LOCATION '/tmp/googleplay'
tblproperties ("skip.header.line.count"="1");

SELECT * FROM googleplay0 WHERE App not like 'Life Made WI-Fi%' ;

DROP TABLE IF EXISTS googleplay;
CREATE TABLE googleplay as SELECT * FROM googleplay0 WHERE App not like 'Life Made WI-Fi%';

SELECT * from googleplay limit 5;

SELECT count(distinct App) from googleplay;
SELECT count(App) from googleplay;


--findings: Life Made WI-Fi Touchscreen Photo Frame - missing 
--best option to import : tsv 

--Task 1--
DROP TABLE IF EXISTS task1;
CREATE TABLE task1 
ROW FORMAT DELIMITED                                                                                                                                                    
FIELDS TERMINATED BY '\t'
AS
SELECT count(App) as count, category from googleplay
GROUP BY category;

--Task 2-- 
DROP TABLE IF EXISTS task2;
CREATE TABLE task2 
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY '\t'
AS
SELECT App, rating  FROM googleplay
WHERE cast(rating as string) not like 'NaN' and rating>4.5 and rating<5.1
ORDER BY rating DESC;

--Task 3--
-- size is in forem xxxM, Varies, xxxk,
SELECT appsize FROM googleplay LIMIT 10;

SELECT * from googleplay
WHERE appsize not like '%M' and appsize not like 'Vari%' and appsize not like '%k' ;

SELECT count(app) from googleplay
WHERE appsize like 'Varies%';
-- 1695 apps have insufficient info about size 
-- +3 for Life Made WI-Fi Touchscreen Photo Frame

DROP TABLE size_count;

CREATE TABLE size_count AS SELECT appsize, 
    case WHEN appsize LIKE '%M' THEN 'MB' 
         WHEN appsize LIKE '%k' THEN 'kB' 
    else 'special'
    end as size_unit,
    cast(substr(appsize,0, length(appsize)-1) as double) as relative_size
FROM googleplay;    

DROP TABLE IF EXISTS task3;
CREATE TABLE task3 
ROW FORMAT DELIMITED                                                                                                                                                    
FIELDS TERMINATED BY '\t' 
AS
with S1 as (select sum(relative_size) as allMB from size_count
where size_unit like 'MB'), 
S2 as (select (sum(relative_size))/1000 as allkbinMB from size_count
where size_unit like 'kB') 
select allmb+allkbinmb as total_size from S1 join S2 ;

--!TODO + cca priemer za tie ktore maju premenlivu velkost

--Task 4--
DROP TABLE IF EXISTS task4;
CREATE TABLE task4 
ROW FORMAT DELIMITED                                                                                                                                                    
FIELDS TERMINATED BY '\t' 
AS
SELECT count(distinct category) as count_of_categories from googleplay;


--Task 5--
--DROP TABLE task5
--CREATE TABLE task5 
--ROW FORMAT DELIMITED
--FIELDS TERIMATED BY '\t'
--AS
--select corr(installs, appsize) from googleplay;
