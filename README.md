# Googleplaystore analysis
This project provides some analysis of googleplaystore dataset and provides a way how to export the result to external RDBMS

## Prerequisities
You will need hadoop environment with basic setup.
If you miss MSSQL server driver you can use one of attached or download the one which satisfies your java version
and copy it to your SQOOP_LIB directory.
E.g. for Hortonworks sandbox 2.6.5 use following:
> tar -xzvf sqljdbc_7.2.2.0_enu.tar.gz 

> cp /sqljdbc_7.2/enu/mssql-jdbc_7.2.2.jre8.jar /usr/hdp/current/sqoop-client/lib/

## Run
To run the code use 
> ./perform_tasks.sh 

To schedule daily/weekly/... updates copy to cron with corresponding paths
> cp perform_tasks.sh /etc/cron.daily

