// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("SQLHash")
    public String SQLHash;

    @NameInMap("CPUTime")
    public Long CPUTime;

    @NameInMap("LogicalIORead")
    public Long logicalIORead;

    @NameInMap("PhysicalIORead")
    public Long physicalIORead;

    @NameInMap("WritesIOCount")
    public Long writesIOCount;

    @NameInMap("RowsAffectedCount")
    public Long rowsAffectedCount;

    @NameInMap("LastRowsAffectedCount")
    public Long lastRowsAffectedCount;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSlowLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSlowLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSlowLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowLogRecordsResponseBody setSQLHash(String SQLHash) {
        this.SQLHash = SQLHash;
        return this;
    }
    public String getSQLHash() {
        return this.SQLHash;
    }

    public DescribeSlowLogRecordsResponseBody setCPUTime(Long CPUTime) {
        this.CPUTime = CPUTime;
        return this;
    }
    public Long getCPUTime() {
        return this.CPUTime;
    }

    public DescribeSlowLogRecordsResponseBody setLogicalIORead(Long logicalIORead) {
        this.logicalIORead = logicalIORead;
        return this;
    }
    public Long getLogicalIORead() {
        return this.logicalIORead;
    }

    public DescribeSlowLogRecordsResponseBody setPhysicalIORead(Long physicalIORead) {
        this.physicalIORead = physicalIORead;
        return this;
    }
    public Long getPhysicalIORead() {
        return this.physicalIORead;
    }

    public DescribeSlowLogRecordsResponseBody setWritesIOCount(Long writesIOCount) {
        this.writesIOCount = writesIOCount;
        return this;
    }
    public Long getWritesIOCount() {
        return this.writesIOCount;
    }

    public DescribeSlowLogRecordsResponseBody setRowsAffectedCount(Long rowsAffectedCount) {
        this.rowsAffectedCount = rowsAffectedCount;
        return this;
    }
    public Long getRowsAffectedCount() {
        return this.rowsAffectedCount;
    }

    public DescribeSlowLogRecordsResponseBody setLastRowsAffectedCount(Long lastRowsAffectedCount) {
        this.lastRowsAffectedCount = lastRowsAffectedCount;
        return this;
    }
    public Long getLastRowsAffectedCount() {
        return this.lastRowsAffectedCount;
    }

    public DescribeSlowLogRecordsResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeSlowLogRecordsResponseBody setItems(DescribeSlowLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord extends TeaModel {
        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("QueryTimes")
        public Long queryTimes;

        @NameInMap("LockTimes")
        public Long lockTimes;

        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        @NameInMap("QueryTimeMS")
        public Long queryTimeMS;

        @NameInMap("CpuTime")
        public Long cpuTime;

        @NameInMap("LogicalIORead")
        public Long logicalIORead;

        @NameInMap("PhysicalIORead")
        public Long physicalIORead;

        @NameInMap("WriteIOCount")
        public Long writeIOCount;

        @NameInMap("RowsAffectedCount")
        public Long rowsAffectedCount;

        @NameInMap("LastRowsAffectedCount")
        public Long lastRowsAffectedCount;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ClientHostName")
        public String clientHostName;

        public static DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord self = new DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setQueryTimes(Long queryTimes) {
            this.queryTimes = queryTimes;
            return this;
        }
        public Long getQueryTimes() {
            return this.queryTimes;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setLockTimes(Long lockTimes) {
            this.lockTimes = lockTimes;
            return this;
        }
        public Long getLockTimes() {
            return this.lockTimes;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setParseRowCounts(Long parseRowCounts) {
            this.parseRowCounts = parseRowCounts;
            return this;
        }
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setQueryTimeMS(Long queryTimeMS) {
            this.queryTimeMS = queryTimeMS;
            return this;
        }
        public Long getQueryTimeMS() {
            return this.queryTimeMS;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setLogicalIORead(Long logicalIORead) {
            this.logicalIORead = logicalIORead;
            return this;
        }
        public Long getLogicalIORead() {
            return this.logicalIORead;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setPhysicalIORead(Long physicalIORead) {
            this.physicalIORead = physicalIORead;
            return this;
        }
        public Long getPhysicalIORead() {
            return this.physicalIORead;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setWriteIOCount(Long writeIOCount) {
            this.writeIOCount = writeIOCount;
            return this;
        }
        public Long getWriteIOCount() {
            return this.writeIOCount;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setRowsAffectedCount(Long rowsAffectedCount) {
            this.rowsAffectedCount = rowsAffectedCount;
            return this;
        }
        public Long getRowsAffectedCount() {
            return this.rowsAffectedCount;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setLastRowsAffectedCount(Long lastRowsAffectedCount) {
            this.lastRowsAffectedCount = lastRowsAffectedCount;
            return this;
        }
        public Long getLastRowsAffectedCount() {
            return this.lastRowsAffectedCount;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setClientHostName(String clientHostName) {
            this.clientHostName = clientHostName;
            return this;
        }
        public String getClientHostName() {
            return this.clientHostName;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("SQLSlowRecord")
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord> SQLSlowRecord;

        public static DescribeSlowLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItems self = new DescribeSlowLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItems setSQLSlowRecord(java.util.List<DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord> SQLSlowRecord) {
            this.SQLSlowRecord = SQLSlowRecord;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord> getSQLSlowRecord() {
            return this.SQLSlowRecord;
        }

    }

}
