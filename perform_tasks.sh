echo 'Copy some files before start'
hadoop fs -rm -r /tmp/googleplay
hadoop fs -mkdir /tmp/googleplay
hadoop fs -put ./googleplaystore.tsv /tmp/googleplay
hdfs dfs -ls /tmp/googleplay
hive -f hive_analysis.sql > /dev/null
spark-submit correl2.py
echo 'preparing load to external RDB'
chmod +x ./sqoop_exp.sh
hdfs dfs -put sqoop.pwd /tmp
exec ./sqoop_exp.sh
echo 'all jobs done' 
