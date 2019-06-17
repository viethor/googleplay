from pyspark.sql import SparkSession
from pyspark.ml.stat import Correlation

def correl():
    spark = SparkSession\
            .builder\
            .appName("Test")\
            .getOrCreate()

    rawData = spark.sql("select * from matus_marton.googleplay")
    df_gp = rawData.toPandas()
    df_gp.corr()
    df_gp.describe()


    rawData.show()
    Correlation.corr(rawData, ["rating","reviews"])
    rawData.describe()
    
    return ('Correlation computed')

