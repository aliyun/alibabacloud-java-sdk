// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("SQLHash")
    @Validation(required = true)
    public String SQLHash;

    @NameInMap("CPUTime")
    @Validation(required = true)
    public Long CPUTime;

    @NameInMap("LogicalIORead")
    @Validation(required = true)
    public Long logicalIORead;

    @NameInMap("PhysicalIORead")
    @Validation(required = true)
    public Long physicalIORead;

    @NameInMap("WritesIOCount")
    @Validation(required = true)
    public Long writesIOCount;

    @NameInMap("RowsAffectedCount")
    @Validation(required = true)
    public Long rowsAffectedCount;

    @NameInMap("LastRowsAffectedCount")
    @Validation(required = true)
    public Long lastRowsAffectedCount;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSlowLogRecordsResponseItems items;

    public static DescribeSlowLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponse self = new DescribeSlowLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSlowLogRecordsResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSlowLogRecordsResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSlowLogRecordsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowLogRecordsResponse setSQLHash(String SQLHash) {
        this.SQLHash = SQLHash;
        return this;
    }
    public String getSQLHash() {
        return this.SQLHash;
    }

    public DescribeSlowLogRecordsResponse setCPUTime(Long CPUTime) {
        this.CPUTime = CPUTime;
        return this;
    }
    public Long getCPUTime() {
        return this.CPUTime;
    }

    public DescribeSlowLogRecordsResponse setLogicalIORead(Long logicalIORead) {
        this.logicalIORead = logicalIORead;
        return this;
    }
    public Long getLogicalIORead() {
        return this.logicalIORead;
    }

    public DescribeSlowLogRecordsResponse setPhysicalIORead(Long physicalIORead) {
        this.physicalIORead = physicalIORead;
        return this;
    }
    public Long getPhysicalIORead() {
        return this.physicalIORead;
    }

    public DescribeSlowLogRecordsResponse setWritesIOCount(Long writesIOCount) {
        this.writesIOCount = writesIOCount;
        return this;
    }
    public Long getWritesIOCount() {
        return this.writesIOCount;
    }

    public DescribeSlowLogRecordsResponse setRowsAffectedCount(Long rowsAffectedCount) {
        this.rowsAffectedCount = rowsAffectedCount;
        return this;
    }
    public Long getRowsAffectedCount() {
        return this.rowsAffectedCount;
    }

    public DescribeSlowLogRecordsResponse setLastRowsAffectedCount(Long lastRowsAffectedCount) {
        this.lastRowsAffectedCount = lastRowsAffectedCount;
        return this;
    }
    public Long getLastRowsAffectedCount() {
        return this.lastRowsAffectedCount;
    }

    public DescribeSlowLogRecordsResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeSlowLogRecordsResponse setItems(DescribeSlowLogRecordsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeSlowLogRecordsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeSlowLogRecordsResponseItemsSQLSlowRecord extends TeaModel {
        @NameInMap("HostAddress")
        @Validation(required = true)
        public String hostAddress;

        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("QueryTimes")
        @Validation(required = true)
        public Long queryTimes;

        @NameInMap("LockTimes")
        @Validation(required = true)
        public Long lockTimes;

        @NameInMap("ParseRowCounts")
        @Validation(required = true)
        public Long parseRowCounts;

        @NameInMap("ReturnRowCounts")
        @Validation(required = true)
        public Long returnRowCounts;

        @NameInMap("ExecutionStartTime")
        @Validation(required = true)
        public String executionStartTime;

        @NameInMap("QueryTimeMS")
        @Validation(required = true)
        public Long queryTimeMS;

        @NameInMap("CpuTime")
        @Validation(required = true)
        public Long cpuTime;

        @NameInMap("LogicalIORead")
        @Validation(required = true)
        public Long logicalIORead;

        @NameInMap("PhysicalIORead")
        @Validation(required = true)
        public Long physicalIORead;

        @NameInMap("WriteIOCount")
        @Validation(required = true)
        public Long writeIOCount;

        @NameInMap("RowsAffectedCount")
        @Validation(required = true)
        public Long rowsAffectedCount;

        @NameInMap("LastRowsAffectedCount")
        @Validation(required = true)
        public Long lastRowsAffectedCount;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("ApplicationName")
        @Validation(required = true)
        public String applicationName;

        @NameInMap("ClientHostName")
        @Validation(required = true)
        public String clientHostName;

        public static DescribeSlowLogRecordsResponseItemsSQLSlowRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseItemsSQLSlowRecord self = new DescribeSlowLogRecordsResponseItemsSQLSlowRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setQueryTimes(Long queryTimes) {
            this.queryTimes = queryTimes;
            return this;
        }
        public Long getQueryTimes() {
            return this.queryTimes;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setLockTimes(Long lockTimes) {
            this.lockTimes = lockTimes;
            return this;
        }
        public Long getLockTimes() {
            return this.lockTimes;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setParseRowCounts(Long parseRowCounts) {
            this.parseRowCounts = parseRowCounts;
            return this;
        }
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setQueryTimeMS(Long queryTimeMS) {
            this.queryTimeMS = queryTimeMS;
            return this;
        }
        public Long getQueryTimeMS() {
            return this.queryTimeMS;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setLogicalIORead(Long logicalIORead) {
            this.logicalIORead = logicalIORead;
            return this;
        }
        public Long getLogicalIORead() {
            return this.logicalIORead;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setPhysicalIORead(Long physicalIORead) {
            this.physicalIORead = physicalIORead;
            return this;
        }
        public Long getPhysicalIORead() {
            return this.physicalIORead;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setWriteIOCount(Long writeIOCount) {
            this.writeIOCount = writeIOCount;
            return this;
        }
        public Long getWriteIOCount() {
            return this.writeIOCount;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setRowsAffectedCount(Long rowsAffectedCount) {
            this.rowsAffectedCount = rowsAffectedCount;
            return this;
        }
        public Long getRowsAffectedCount() {
            return this.rowsAffectedCount;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setLastRowsAffectedCount(Long lastRowsAffectedCount) {
            this.lastRowsAffectedCount = lastRowsAffectedCount;
            return this;
        }
        public Long getLastRowsAffectedCount() {
            return this.lastRowsAffectedCount;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeSlowLogRecordsResponseItemsSQLSlowRecord setClientHostName(String clientHostName) {
            this.clientHostName = clientHostName;
            return this;
        }
        public String getClientHostName() {
            return this.clientHostName;
        }

    }

    public static class DescribeSlowLogRecordsResponseItems extends TeaModel {
        @NameInMap("SQLSlowRecord")
        @Validation(required = true)
        public java.util.List<DescribeSlowLogRecordsResponseItemsSQLSlowRecord> SQLSlowRecord;

        public static DescribeSlowLogRecordsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseItems self = new DescribeSlowLogRecordsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseItems setSQLSlowRecord(java.util.List<DescribeSlowLogRecordsResponseItemsSQLSlowRecord> SQLSlowRecord) {
            this.SQLSlowRecord = SQLSlowRecord;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseItemsSQLSlowRecord> getSQLSlowRecord() {
            return this.SQLSlowRecord;
        }

    }

}
