from pyspark.sql import SparkSession
import pandas as pd

spark = SparkSession\
        .builder\
        .master("yarn")\
        .enableHiveSupport()\
        .appName("Test")\
        .getOrCreate()

spark.sql("use googleplaystore_db")
rawData = spark.sql("select * from googleplay")
df_gp = rawData.toPandas()
a=df_gp.corr()
a.to_csv("a.csv")

#with open('a.csv','r') as f:
#    s = f.read()
#s = open("a.csv").read()
#t=open("a.csv",'w')
#t.write("x")
#t.write(s)
#t.close
pd.read_csv("a.csv")
df_corr = pd.read_csv("a.csv")
df_target = spark.createDataFrame(df_corr.astype(str)) 
df_target.createOrReplaceTempView("temp_task5")
spark.sql("create table task as select * from temp_task5");

spark.stop()
