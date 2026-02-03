// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <p>Cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb_mysql</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>List of slow log details.</p>
     */
    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of records on this page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of SQL statements.</p>
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

    public DescribeSlowLogRecordsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
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
         * <p>Database name.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-*****************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>Time when the SQL starts execution. The format is <code>YYYY-MM-DDThh:mmZ</code> (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-07T03:47Z</p>
         */
        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        /**
         * <p>Client address connecting to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb[testdb] @  [100.<strong>.</strong>.242]</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("LockTimeMS")
        public Long lockTimeMS;

        /**
         * <p>SQL lock duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockTimes")
        public Long lockTimes;

        /**
         * <p>Number of rows parsed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        /**
         * <p>Query time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("QueryTimeMS")
        public Long queryTimeMS;

        /**
         * <p>SQL execution duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("QueryTimes")
        public Long queryTimes;

        /**
         * <p>Number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        /**
         * <p>Unique identifier for the SQL statement in slow log statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>U2FsdGVk****</p>
         */
        @NameInMap("SQLHash")
        public String SQLHash;

        /**
         * <p>Query statement.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        public static DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord self = new DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
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

        public DescribeSlowLogRecordsResponseBodyItemsSQLSlowRecord setLockTimeMS(Long lockTimeMS) {
            this.lockTimeMS = lockTimeMS;
            return this;
        }
        public Long getLockTimeMS() {
            return this.lockTimeMS;
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
