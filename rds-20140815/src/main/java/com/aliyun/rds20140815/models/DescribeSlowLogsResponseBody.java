// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogsResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("Items")
    public DescribeSlowLogsResponseBodyItems items;

    public static DescribeSlowLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogsResponseBody self = new DescribeSlowLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowLogsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSlowLogsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSlowLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSlowLogsResponseBody setItems(DescribeSlowLogsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSlowLogsResponseBodyItemsSQLSlowLog extends TeaModel {
        @NameInMap("MaxLastRowsAffectedCounts")
        public Long maxLastRowsAffectedCounts;

        @NameInMap("ReturnMaxRowCount")
        public Long returnMaxRowCount;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("SQLServerMaxCpuTime")
        public Long SQLServerMaxCpuTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AvgLastRowsAffectedCounts")
        public Long avgLastRowsAffectedCounts;

        @NameInMap("MinLastRowsAffectedCounts")
        public Long minLastRowsAffectedCounts;

        @NameInMap("ParseTotalRowCounts")
        public Long parseTotalRowCounts;

        @NameInMap("TotalLockTimes")
        public Long totalLockTimes;

        @NameInMap("MySQLTotalExecutionCounts")
        public Long mySQLTotalExecutionCounts;

        @NameInMap("SQLServerMinCpuTime")
        public Long SQLServerMinCpuTime;

        @NameInMap("SQLHASH")
        public String SQLHASH;

        @NameInMap("MinIOWriteCounts")
        public Long minIOWriteCounts;

        @NameInMap("ParseMaxRowCount")
        public Long parseMaxRowCount;

        @NameInMap("MaxLogicalReadCounts")
        public Long maxLogicalReadCounts;

        @NameInMap("MySQLTotalExecutionTimes")
        public Long mySQLTotalExecutionTimes;

        @NameInMap("SQLServerTotalExecutionCounts")
        public Long SQLServerTotalExecutionCounts;

        @NameInMap("ReturnTotalRowCounts")
        public Long returnTotalRowCounts;

        @NameInMap("MaxLockTime")
        public Long maxLockTime;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("MinRowsAffectedCounts")
        public Long minRowsAffectedCounts;

        @NameInMap("TotalLogicalReadCounts")
        public Long totalLogicalReadCounts;

        @NameInMap("TotalPhysicalReadCounts")
        public Long totalPhysicalReadCounts;

        @NameInMap("ReportTime")
        public String reportTime;

        @NameInMap("MaxPhysicalReadCounts")
        public Long maxPhysicalReadCounts;

        @NameInMap("SQLServerTotalCpuTime")
        public Long SQLServerTotalCpuTime;

        @NameInMap("TotalIOWriteCounts")
        public Long totalIOWriteCounts;

        @NameInMap("MaxRowsAffectedCounts")
        public Long maxRowsAffectedCounts;

        @NameInMap("AvgIOWriteCounts")
        public Long avgIOWriteCounts;

        @NameInMap("MinPhysicalReadCounts")
        public Long minPhysicalReadCounts;

        @NameInMap("SlowLogId")
        public Long slowLogId;

        @NameInMap("MaxExecutionTime")
        public Long maxExecutionTime;

        @NameInMap("AvgExecutionTime")
        public Long avgExecutionTime;

        @NameInMap("SQLServerAvgExecutionTime")
        public Long SQLServerAvgExecutionTime;

        @NameInMap("MaxIOWriteCounts")
        public Long maxIOWriteCounts;

        @NameInMap("SQLServerAvgCpuTime")
        public Long SQLServerAvgCpuTime;

        @NameInMap("TotalLastRowsAffectedCounts")
        public Long totalLastRowsAffectedCounts;

        @NameInMap("AvgLogicalReadCounts")
        public Long avgLogicalReadCounts;

        @NameInMap("SQLServerMinExecutionTime")
        public Long SQLServerMinExecutionTime;

        @NameInMap("SQLIdStr")
        public String SQLIdStr;

        @NameInMap("SQLServerTotalExecutionTimes")
        public Long SQLServerTotalExecutionTimes;

        @NameInMap("AvgRowsAffectedCounts")
        public Long avgRowsAffectedCounts;

        @NameInMap("TotalRowsAffectedCounts")
        public Long totalRowsAffectedCounts;

        @NameInMap("AvgPhysicalReadCounts")
        public Long avgPhysicalReadCounts;

        @NameInMap("MinLogicalReadCounts")
        public Long minLogicalReadCounts;

        public static DescribeSlowLogsResponseBodyItemsSQLSlowLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogsResponseBodyItemsSQLSlowLog self = new DescribeSlowLogsResponseBodyItemsSQLSlowLog();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxLastRowsAffectedCounts(Long maxLastRowsAffectedCounts) {
            this.maxLastRowsAffectedCounts = maxLastRowsAffectedCounts;
            return this;
        }
        public Long getMaxLastRowsAffectedCounts() {
            return this.maxLastRowsAffectedCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setReturnMaxRowCount(Long returnMaxRowCount) {
            this.returnMaxRowCount = returnMaxRowCount;
            return this;
        }
        public Long getReturnMaxRowCount() {
            return this.returnMaxRowCount;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLServerMaxCpuTime(Long SQLServerMaxCpuTime) {
            this.SQLServerMaxCpuTime = SQLServerMaxCpuTime;
            return this;
        }
        public Long getSQLServerMaxCpuTime() {
            return this.SQLServerMaxCpuTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setAvgLastRowsAffectedCounts(Long avgLastRowsAffectedCounts) {
            this.avgLastRowsAffectedCounts = avgLastRowsAffectedCounts;
            return this;
        }
        public Long getAvgLastRowsAffectedCounts() {
            return this.avgLastRowsAffectedCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMinLastRowsAffectedCounts(Long minLastRowsAffectedCounts) {
            this.minLastRowsAffectedCounts = minLastRowsAffectedCounts;
            return this;
        }
        public Long getMinLastRowsAffectedCounts() {
            return this.minLastRowsAffectedCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setParseTotalRowCounts(Long parseTotalRowCounts) {
            this.parseTotalRowCounts = parseTotalRowCounts;
            return this;
        }
        public Long getParseTotalRowCounts() {
            return this.parseTotalRowCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalLockTimes(Long totalLockTimes) {
            this.totalLockTimes = totalLockTimes;
            return this;
        }
        public Long getTotalLockTimes() {
            return this.totalLockTimes;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
            this.mySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
            return this;
        }
        public Long getMySQLTotalExecutionCounts() {
            return this.mySQLTotalExecutionCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLServerMinCpuTime(Long SQLServerMinCpuTime) {
            this.SQLServerMinCpuTime = SQLServerMinCpuTime;
            return this;
        }
        public Long getSQLServerMinCpuTime() {
            return this.SQLServerMinCpuTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLHASH(String SQLHASH) {
            this.SQLHASH = SQLHASH;
            return this;
        }
        public String getSQLHASH() {
            return this.SQLHASH;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMinIOWriteCounts(Long minIOWriteCounts) {
            this.minIOWriteCounts = minIOWriteCounts;
            return this;
        }
        public Long getMinIOWriteCounts() {
            return this.minIOWriteCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setParseMaxRowCount(Long parseMaxRowCount) {
            this.parseMaxRowCount = parseMaxRowCount;
            return this;
        }
        public Long getParseMaxRowCount() {
            return this.parseMaxRowCount;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxLogicalReadCounts(Long maxLogicalReadCounts) {
            this.maxLogicalReadCounts = maxLogicalReadCounts;
            return this;
        }
        public Long getMaxLogicalReadCounts() {
            return this.maxLogicalReadCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
            this.mySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
            return this;
        }
        public Long getMySQLTotalExecutionTimes() {
            return this.mySQLTotalExecutionTimes;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLServerTotalExecutionCounts(Long SQLServerTotalExecutionCounts) {
            this.SQLServerTotalExecutionCounts = SQLServerTotalExecutionCounts;
            return this;
        }
        public Long getSQLServerTotalExecutionCounts() {
            return this.SQLServerTotalExecutionCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setReturnTotalRowCounts(Long returnTotalRowCounts) {
            this.returnTotalRowCounts = returnTotalRowCounts;
            return this;
        }
        public Long getReturnTotalRowCounts() {
            return this.returnTotalRowCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxLockTime(Long maxLockTime) {
            this.maxLockTime = maxLockTime;
            return this;
        }
        public Long getMaxLockTime() {
            return this.maxLockTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMinRowsAffectedCounts(Long minRowsAffectedCounts) {
            this.minRowsAffectedCounts = minRowsAffectedCounts;
            return this;
        }
        public Long getMinRowsAffectedCounts() {
            return this.minRowsAffectedCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalLogicalReadCounts(Long totalLogicalReadCounts) {
            this.totalLogicalReadCounts = totalLogicalReadCounts;
            return this;
        }
        public Long getTotalLogicalReadCounts() {
            return this.totalLogicalReadCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalPhysicalReadCounts(Long totalPhysicalReadCounts) {
            this.totalPhysicalReadCounts = totalPhysicalReadCounts;
            return this;
        }
        public Long getTotalPhysicalReadCounts() {
            return this.totalPhysicalReadCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxPhysicalReadCounts(Long maxPhysicalReadCounts) {
            this.maxPhysicalReadCounts = maxPhysicalReadCounts;
            return this;
        }
        public Long getMaxPhysicalReadCounts() {
            return this.maxPhysicalReadCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLServerTotalCpuTime(Long SQLServerTotalCpuTime) {
            this.SQLServerTotalCpuTime = SQLServerTotalCpuTime;
            return this;
        }
        public Long getSQLServerTotalCpuTime() {
            return this.SQLServerTotalCpuTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalIOWriteCounts(Long totalIOWriteCounts) {
            this.totalIOWriteCounts = totalIOWriteCounts;
            return this;
        }
        public Long getTotalIOWriteCounts() {
            return this.totalIOWriteCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxRowsAffectedCounts(Long maxRowsAffectedCounts) {
            this.maxRowsAffectedCounts = maxRowsAffectedCounts;
            return this;
        }
        public Long getMaxRowsAffectedCounts() {
            return this.maxRowsAffectedCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setAvgIOWriteCounts(Long avgIOWriteCounts) {
            this.avgIOWriteCounts = avgIOWriteCounts;
            return this;
        }
        public Long getAvgIOWriteCounts() {
            return this.avgIOWriteCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMinPhysicalReadCounts(Long minPhysicalReadCounts) {
            this.minPhysicalReadCounts = minPhysicalReadCounts;
            return this;
        }
        public Long getMinPhysicalReadCounts() {
            return this.minPhysicalReadCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSlowLogId(Long slowLogId) {
            this.slowLogId = slowLogId;
            return this;
        }
        public Long getSlowLogId() {
            return this.slowLogId;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxExecutionTime(Long maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            return this;
        }
        public Long getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setAvgExecutionTime(Long avgExecutionTime) {
            this.avgExecutionTime = avgExecutionTime;
            return this;
        }
        public Long getAvgExecutionTime() {
            return this.avgExecutionTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLServerAvgExecutionTime(Long SQLServerAvgExecutionTime) {
            this.SQLServerAvgExecutionTime = SQLServerAvgExecutionTime;
            return this;
        }
        public Long getSQLServerAvgExecutionTime() {
            return this.SQLServerAvgExecutionTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxIOWriteCounts(Long maxIOWriteCounts) {
            this.maxIOWriteCounts = maxIOWriteCounts;
            return this;
        }
        public Long getMaxIOWriteCounts() {
            return this.maxIOWriteCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLServerAvgCpuTime(Long SQLServerAvgCpuTime) {
            this.SQLServerAvgCpuTime = SQLServerAvgCpuTime;
            return this;
        }
        public Long getSQLServerAvgCpuTime() {
            return this.SQLServerAvgCpuTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalLastRowsAffectedCounts(Long totalLastRowsAffectedCounts) {
            this.totalLastRowsAffectedCounts = totalLastRowsAffectedCounts;
            return this;
        }
        public Long getTotalLastRowsAffectedCounts() {
            return this.totalLastRowsAffectedCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setAvgLogicalReadCounts(Long avgLogicalReadCounts) {
            this.avgLogicalReadCounts = avgLogicalReadCounts;
            return this;
        }
        public Long getAvgLogicalReadCounts() {
            return this.avgLogicalReadCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLServerMinExecutionTime(Long SQLServerMinExecutionTime) {
            this.SQLServerMinExecutionTime = SQLServerMinExecutionTime;
            return this;
        }
        public Long getSQLServerMinExecutionTime() {
            return this.SQLServerMinExecutionTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLIdStr(String SQLIdStr) {
            this.SQLIdStr = SQLIdStr;
            return this;
        }
        public String getSQLIdStr() {
            return this.SQLIdStr;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLServerTotalExecutionTimes(Long SQLServerTotalExecutionTimes) {
            this.SQLServerTotalExecutionTimes = SQLServerTotalExecutionTimes;
            return this;
        }
        public Long getSQLServerTotalExecutionTimes() {
            return this.SQLServerTotalExecutionTimes;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setAvgRowsAffectedCounts(Long avgRowsAffectedCounts) {
            this.avgRowsAffectedCounts = avgRowsAffectedCounts;
            return this;
        }
        public Long getAvgRowsAffectedCounts() {
            return this.avgRowsAffectedCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalRowsAffectedCounts(Long totalRowsAffectedCounts) {
            this.totalRowsAffectedCounts = totalRowsAffectedCounts;
            return this;
        }
        public Long getTotalRowsAffectedCounts() {
            return this.totalRowsAffectedCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setAvgPhysicalReadCounts(Long avgPhysicalReadCounts) {
            this.avgPhysicalReadCounts = avgPhysicalReadCounts;
            return this;
        }
        public Long getAvgPhysicalReadCounts() {
            return this.avgPhysicalReadCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMinLogicalReadCounts(Long minLogicalReadCounts) {
            this.minLogicalReadCounts = minLogicalReadCounts;
            return this;
        }
        public Long getMinLogicalReadCounts() {
            return this.minLogicalReadCounts;
        }

    }

    public static class DescribeSlowLogsResponseBodyItems extends TeaModel {
        @NameInMap("SQLSlowLog")
        public java.util.List<DescribeSlowLogsResponseBodyItemsSQLSlowLog> SQLSlowLog;

        public static DescribeSlowLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogsResponseBodyItems self = new DescribeSlowLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogsResponseBodyItems setSQLSlowLog(java.util.List<DescribeSlowLogsResponseBodyItemsSQLSlowLog> SQLSlowLog) {
            this.SQLSlowLog = SQLSlowLog;
            return this;
        }
        public java.util.List<DescribeSlowLogsResponseBodyItemsSQLSlowLog> getSQLSlowLog() {
            return this.SQLSlowLog;
        }

    }

}
