// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSlowLogsResponseItems items;

    public static DescribeSlowLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogsResponse self = new DescribeSlowLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogsResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSlowLogsResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSlowLogsResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowLogsResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogsResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSlowLogsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogsResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowLogsResponse setItems(DescribeSlowLogsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeSlowLogsResponseItemsSQLSlowLog extends TeaModel {
        @NameInMap("SlowLogId")
        @Validation(required = true)
        public Long slowLogId;

        @NameInMap("SQLHASH")
        @Validation(required = true)
        public String SQLHASH;

        @NameInMap("SQLIdStr")
        @Validation(required = true)
        public String SQLIdStr;

        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("MySQLTotalExecutionCounts")
        @Validation(required = true)
        public Long mySQLTotalExecutionCounts;

        @NameInMap("MySQLTotalExecutionTimes")
        @Validation(required = true)
        public Long mySQLTotalExecutionTimes;

        @NameInMap("TotalLockTimes")
        @Validation(required = true)
        public Long totalLockTimes;

        @NameInMap("MaxLockTime")
        @Validation(required = true)
        public Long maxLockTime;

        @NameInMap("ParseTotalRowCounts")
        @Validation(required = true)
        public Long parseTotalRowCounts;

        @NameInMap("ParseMaxRowCount")
        @Validation(required = true)
        public Long parseMaxRowCount;

        @NameInMap("ReturnTotalRowCounts")
        @Validation(required = true)
        public Long returnTotalRowCounts;

        @NameInMap("ReturnMaxRowCount")
        @Validation(required = true)
        public Long returnMaxRowCount;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("SQLServerTotalExecutionCounts")
        @Validation(required = true)
        public Long SQLServerTotalExecutionCounts;

        @NameInMap("SQLServerTotalExecutionTimes")
        @Validation(required = true)
        public Long SQLServerTotalExecutionTimes;

        @NameInMap("TotalLogicalReadCounts")
        @Validation(required = true)
        public Long totalLogicalReadCounts;

        @NameInMap("TotalPhysicalReadCounts")
        @Validation(required = true)
        public Long totalPhysicalReadCounts;

        @NameInMap("ReportTime")
        @Validation(required = true)
        public String reportTime;

        @NameInMap("MaxExecutionTime")
        @Validation(required = true)
        public Long maxExecutionTime;

        @NameInMap("AvgExecutionTime")
        @Validation(required = true)
        public Long avgExecutionTime;

        public static DescribeSlowLogsResponseItemsSQLSlowLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogsResponseItemsSQLSlowLog self = new DescribeSlowLogsResponseItemsSQLSlowLog();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setSlowLogId(Long slowLogId) {
            this.slowLogId = slowLogId;
            return this;
        }
        public Long getSlowLogId() {
            return this.slowLogId;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setSQLHASH(String SQLHASH) {
            this.SQLHASH = SQLHASH;
            return this;
        }
        public String getSQLHASH() {
            return this.SQLHASH;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setSQLIdStr(String SQLIdStr) {
            this.SQLIdStr = SQLIdStr;
            return this;
        }
        public String getSQLIdStr() {
            return this.SQLIdStr;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setMySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
            this.mySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
            return this;
        }
        public Long getMySQLTotalExecutionCounts() {
            return this.mySQLTotalExecutionCounts;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setMySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
            this.mySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
            return this;
        }
        public Long getMySQLTotalExecutionTimes() {
            return this.mySQLTotalExecutionTimes;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setTotalLockTimes(Long totalLockTimes) {
            this.totalLockTimes = totalLockTimes;
            return this;
        }
        public Long getTotalLockTimes() {
            return this.totalLockTimes;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setMaxLockTime(Long maxLockTime) {
            this.maxLockTime = maxLockTime;
            return this;
        }
        public Long getMaxLockTime() {
            return this.maxLockTime;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setParseTotalRowCounts(Long parseTotalRowCounts) {
            this.parseTotalRowCounts = parseTotalRowCounts;
            return this;
        }
        public Long getParseTotalRowCounts() {
            return this.parseTotalRowCounts;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setParseMaxRowCount(Long parseMaxRowCount) {
            this.parseMaxRowCount = parseMaxRowCount;
            return this;
        }
        public Long getParseMaxRowCount() {
            return this.parseMaxRowCount;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setReturnTotalRowCounts(Long returnTotalRowCounts) {
            this.returnTotalRowCounts = returnTotalRowCounts;
            return this;
        }
        public Long getReturnTotalRowCounts() {
            return this.returnTotalRowCounts;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setReturnMaxRowCount(Long returnMaxRowCount) {
            this.returnMaxRowCount = returnMaxRowCount;
            return this;
        }
        public Long getReturnMaxRowCount() {
            return this.returnMaxRowCount;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setSQLServerTotalExecutionCounts(Long SQLServerTotalExecutionCounts) {
            this.SQLServerTotalExecutionCounts = SQLServerTotalExecutionCounts;
            return this;
        }
        public Long getSQLServerTotalExecutionCounts() {
            return this.SQLServerTotalExecutionCounts;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setSQLServerTotalExecutionTimes(Long SQLServerTotalExecutionTimes) {
            this.SQLServerTotalExecutionTimes = SQLServerTotalExecutionTimes;
            return this;
        }
        public Long getSQLServerTotalExecutionTimes() {
            return this.SQLServerTotalExecutionTimes;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setTotalLogicalReadCounts(Long totalLogicalReadCounts) {
            this.totalLogicalReadCounts = totalLogicalReadCounts;
            return this;
        }
        public Long getTotalLogicalReadCounts() {
            return this.totalLogicalReadCounts;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setTotalPhysicalReadCounts(Long totalPhysicalReadCounts) {
            this.totalPhysicalReadCounts = totalPhysicalReadCounts;
            return this;
        }
        public Long getTotalPhysicalReadCounts() {
            return this.totalPhysicalReadCounts;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setMaxExecutionTime(Long maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            return this;
        }
        public Long getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        public DescribeSlowLogsResponseItemsSQLSlowLog setAvgExecutionTime(Long avgExecutionTime) {
            this.avgExecutionTime = avgExecutionTime;
            return this;
        }
        public Long getAvgExecutionTime() {
            return this.avgExecutionTime;
        }

    }

    public static class DescribeSlowLogsResponseItems extends TeaModel {
        @NameInMap("SQLSlowLog")
        @Validation(required = true)
        public java.util.List<DescribeSlowLogsResponseItemsSQLSlowLog> SQLSlowLog;

        public static DescribeSlowLogsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogsResponseItems self = new DescribeSlowLogsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogsResponseItems setSQLSlowLog(java.util.List<DescribeSlowLogsResponseItemsSQLSlowLog> SQLSlowLog) {
            this.SQLSlowLog = SQLSlowLog;
            return this;
        }
        public java.util.List<DescribeSlowLogsResponseItemsSQLSlowLog> getSQLSlowLog() {
            return this.SQLSlowLog;
        }

    }

}
