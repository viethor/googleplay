from pyspark.sql import SparkSession
from pyspark.ml.stat import Correlation

spark = SparkSession\
        .builder\
	.master("yarn")\
	.enableHiveSupport()\
        .appName("Test")\
        .getOrCreate()

spark.sql("use googleplaystore_db")

data = spark.sql("select * from googleplay")
#df = spark.createDataFrame(data, ["features"])
data.describe()

#r1 = Correlation.corr(df).head() 
#print("Pearson correlation matrix:\n" + str(r1[0]))
#df_gp = rawData.toPandas()
#df_target = df_gp.corr()
#df_gp.describe() 
#df_target.createOrReplaceTempView("mytempTable")
#spark.sql("create table mytable as select * from mytempTable");
spark.stop()
