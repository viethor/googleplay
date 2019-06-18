#sqoop export --connect "jdbc:sqlserver://homeworkserv.database.windows.net:1433; database=TutorialDB" --username matus --P --table tblProductData1 --export-dir data --update-mode allowinsert --update-key ProductKey -- --schema dbo

                                                                                                                                           
sqoop export -Dsqoop.export.records.per.statement=1 -Dsqoop.export.statements.per.transaction=1 --connect "jdbc:sqlserver://homeworkserv.database.windows.net:1433; database=HomeworkDB" --username msd_guest --password-file /tmp/sqoop.pwd --table task1 --export-dir /apps/hive/warehouse/googleplaystore_db.db/task1 --update-mode allowinsert --update-key category --input-fields-terminated-by "\t" -- --schema dbo

sqoop export -Dsqoop.export.records.per.statement=1 -Dsqoop.export.statements.per.transaction=1 --connect "jdbc:sqlserver://homeworkserv.database.windows.net:1433; database=HomeworkDB" --username msd_guest --password-file /tmp/sqoop.pwd --table task2 --export-dir /apps/hive/warehouse/googleplaystore_db.db/task2 --update-mode allowinsert --update-key app --input-fields-terminated-by "\t" -- --schema dbo

sqoop export --connect "jdbc:sqlserver://homeworkserv.database.windows.net:1433; database=HomeworkDB" --username msd_guest --password-file /tmp/sqoop.pwd --table task3 --export-dir /apps/hive/warehouse/googleplaystore_db.db/task3 --update-mode allowinsert --update-key total_size --input-fields-terminated-by "\t" -- --schema dbo
                                                                                  
sqoop export --connect "jdbc:sqlserver://homeworkserv.database.windows.net:1433; database=HomeworkDB" --username msd_guest --password-file /tmp/sqoop.pwd --table task4 --export-dir /apps/hive/warehouse/googleplaystore_db.db/task4 --update-mode allowinsert --update-key count_of_categories --input-fields-terminated-by "\t" -- --schema dbo                                             
                                        
