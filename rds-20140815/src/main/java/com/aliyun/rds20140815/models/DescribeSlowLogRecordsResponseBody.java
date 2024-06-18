// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The type of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>An array that consists of the information about each slow log.</p>
     */
    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of SQL log reports on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4DBB1BB0-E5D8-4D41-B1C9-142364DB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord extends TeaModel {
        /**
         * <p>The name of the application that is connected to the instance.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The hostname of the client.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ClientHostName")
        public String clientHostName;

        /**
         * <p>The duration during which the SQL statement is processed by the CPU. Unit: milliseconds.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.002</p>
         */
        @NameInMap("CpuTime")
        public Long cpuTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The time when the execution of the SQL statement started. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-18T01:40:44Z</p>
         */
        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        /**
         * <p>The name and IP address of the client that is connected to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx[xxx] @  [1xx.xxx.xxx.xx]</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The number of rows that are affected by the last SQL statement.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LastRowsAffectedCount")
        public Long lastRowsAffectedCount;

        /**
         * <p>The lock duration of the query. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockTimes")
        public Long lockTimes;

        /**
         * <p>The number of logical reads.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>383</p>
         */
        @NameInMap("LogicalIORead")
        public Long logicalIORead;

        /**
         * <p>The number of parsed rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        /**
         * <p>The number of physical reads.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("PhysicalIORead")
        public Long physicalIORead;

        /**
         * <p>The execution duration of the query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("QueryTimeMS")
        public Long queryTimeMS;

        /**
         * <p>The execution duration of the query. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("QueryTimes")
        public Long queryTimes;

        /**
         * <p>The number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        /**
         * <p>The number of affected rows.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("RowsAffectedCount")
        public Long rowsAffectedCount;

        /**
         * <p>The unique ID of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>U2FsdGVk****</p>
         */
        @NameInMap("SQLHash")
        public String SQLHash;

        /**
         * <p>The details of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select sleep(2)</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The name of the user.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The number of I/O writes.</p>
         * <blockquote>
         * <p>This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
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

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setSQLHash(String SQLHash) {
            this.SQLHash = SQLHash;
            return this;
        }
        public String getSQLHash() {
            return this.SQLHash;
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
