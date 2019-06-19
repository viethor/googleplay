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
s = open("a.csv").read()
t=open("a.csv",'w')
t.write("col1,col2,col3\nx")
t.write(s)
t.close

spark.stop()
