# Googleplaystore analysis
This project provides some analysis of googleplaystore dataset and provides a way how to export the result to external RDBMS

## Prerequisities
You will need hadoop environment with basic setup.
If you miss MSSQL server driver you can use one of attached or download the one which satisfies your java version
and copy it to your SQOOP_LIB directory.

## Run
To run the code use 
> ./perform_tasks.sh 

To schedule daily/weekly/... updates copy to cron with corresponding paths
> cp perform_tasks.sh /etc/cron.daily

