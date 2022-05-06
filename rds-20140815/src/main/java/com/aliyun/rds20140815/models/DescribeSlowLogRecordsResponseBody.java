// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("CPUTime")
    public Long CPUTime;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    @NameInMap("LastRowsAffectedCount")
    public Long lastRowsAffectedCount;

    @NameInMap("LogicalIORead")
    public Long logicalIORead;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("PhysicalIORead")
    public Long physicalIORead;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RowsAffectedCount")
    public Long rowsAffectedCount;

    @NameInMap("SQLHash")
    public String SQLHash;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("WritesIOCount")
    public Long writesIOCount;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setCPUTime(Long CPUTime) {
        this.CPUTime = CPUTime;
        return this;
    }
    public Long getCPUTime() {
        return this.CPUTime;
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

    public DescribeSlowLogRecordsResponseBody setItems(DescribeSlowLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSlowLogRecordsResponseBody setLastRowsAffectedCount(Long lastRowsAffectedCount) {
        this.lastRowsAffectedCount = lastRowsAffectedCount;
        return this;
    }
    public Long getLastRowsAffectedCount() {
        return this.lastRowsAffectedCount;
    }

    public DescribeSlowLogRecordsResponseBody setLogicalIORead(Long logicalIORead) {
        this.logicalIORead = logicalIORead;
        return this;
    }
    public Long getLogicalIORead() {
        return this.logicalIORead;
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

    public DescribeSlowLogRecordsResponseBody setPhysicalIORead(Long physicalIORead) {
        this.physicalIORead = physicalIORead;
        return this;
    }
    public Long getPhysicalIORead() {
        return this.physicalIORead;
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setRowsAffectedCount(Long rowsAffectedCount) {
        this.rowsAffectedCount = rowsAffectedCount;
        return this;
    }
    public Long getRowsAffectedCount() {
        return this.rowsAffectedCount;
    }

    public DescribeSlowLogRecordsResponseBody setSQLHash(String SQLHash) {
        this.SQLHash = SQLHash;
        return this;
    }
    public String getSQLHash() {
        return this.SQLHash;
    }

    public DescribeSlowLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSlowLogRecordsResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeSlowLogRecordsResponseBody setWritesIOCount(Long writesIOCount) {
        this.writesIOCount = writesIOCount;
        return this;
    }
    public Long getWritesIOCount() {
        return this.writesIOCount;
    }

    public static class DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ClientHostName")
        public String clientHostName;

        @NameInMap("CpuTime")
        public Long cpuTime;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("LastRowsAffectedCount")
        public Long lastRowsAffectedCount;

        @NameInMap("LockTimes")
        public Long lockTimes;

        @NameInMap("LogicalIORead")
        public Long logicalIORead;

        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        @NameInMap("PhysicalIORead")
        public Long physicalIORead;

        @NameInMap("QueryTimeMS")
        public Long queryTimeMS;

        @NameInMap("QueryTimes")
        public Long queryTimes;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("RowsAffectedCount")
        public Long rowsAffectedCount;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("WriteIOCount")
        public Long writeIOCount;

        public static DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord self = new DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord();
            return TeaModel.build(map, self);
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

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setLastRowsAffectedCount(Long lastRowsAffectedCount) {
            this.lastRowsAffectedCount = lastRowsAffectedCount;
            return this;
        }
        public Long getLastRowsAffectedCount() {
            return this.lastRowsAffectedCount;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setLockTimes(Long lockTimes) {
            this.lockTimes = lockTimes;
            return this;
        }
        public Long getLockTimes() {
            return this.lockTimes;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setLogicalIORead(Long logicalIORead) {
            this.logicalIORead = logicalIORead;
            return this;
        }
        public Long getLogicalIORead() {
            return this.logicalIORead;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setParseRowCounts(Long parseRowCounts) {
            this.parseRowCounts = parseRowCounts;
            return this;
        }
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setPhysicalIORead(Long physicalIORead) {
            this.physicalIORead = physicalIORead;
            return this;
        }
        public Long getPhysicalIORead() {
            return this.physicalIORead;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setQueryTimeMS(Long queryTimeMS) {
            this.queryTimeMS = queryTimeMS;
            return this;
        }
        public Long getQueryTimeMS() {
            return this.queryTimeMS;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setQueryTimes(Long queryTimes) {
            this.queryTimes = queryTimes;
            return this;
        }
        public Long getQueryTimes() {
            return this.queryTimes;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setRowsAffectedCount(Long rowsAffectedCount) {
            this.rowsAffectedCount = rowsAffectedCount;
            return this;
        }
        public Long getRowsAffectedCount() {
            return this.rowsAffectedCount;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setWriteIOCount(Long writeIOCount) {
            this.writeIOCount = writeIOCount;
            return this;
        }
        public Long getWriteIOCount() {
            return this.writeIOCount;
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
