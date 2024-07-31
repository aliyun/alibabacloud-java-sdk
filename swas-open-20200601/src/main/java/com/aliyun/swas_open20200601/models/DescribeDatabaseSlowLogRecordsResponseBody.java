// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The database engine that the instance runs.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 30 to 100.</p>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of logical reads.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PhysicalIORead")
    public Long physicalIORead;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The slow query logs returned.</p>
     */
    @NameInMap("SlowLogs")
    public java.util.List<DescribeDatabaseSlowLogRecordsResponseBodySlowLogs> slowLogs;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDatabaseSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseSlowLogRecordsResponseBody self = new DescribeDatabaseSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseSlowLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDatabaseSlowLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatabaseSlowLogRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatabaseSlowLogRecordsResponseBody setPhysicalIORead(Long physicalIORead) {
        this.physicalIORead = physicalIORead;
        return this;
    }
    public Long getPhysicalIORead() {
        return this.physicalIORead;
    }

    public DescribeDatabaseSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabaseSlowLogRecordsResponseBody setSlowLogs(java.util.List<DescribeDatabaseSlowLogRecordsResponseBodySlowLogs> slowLogs) {
        this.slowLogs = slowLogs;
        return this;
    }
    public java.util.List<DescribeDatabaseSlowLogRecordsResponseBodySlowLogs> getSlowLogs() {
        return this.slowLogs;
    }

    public DescribeDatabaseSlowLogRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDatabaseSlowLogRecordsResponseBodySlowLogs extends TeaModel {
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The time when the execution of the SQL statement started. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08T01:40:44Z</p>
         */
        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        /**
         * <p>The name and IP address of the client that is connected to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx[xxx] @ [1xx.xxx.xxx.xx]</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The lock duration of the SQL statement. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockTimes")
        public Long lockTimes;

        /**
         * <p>The number of rows parsed by the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        /**
         * <p>The execution duration of the slow query. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("QueryTimeMS")
        public Long queryTimeMS;

        /**
         * <p>The execution duration of the slow query. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("QueryTimes")
        public Long queryTimes;

        /**
         * <p>The number of rows returned by the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        /**
         * <p>The details of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select sleep(2)</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        public static DescribeDatabaseSlowLogRecordsResponseBodySlowLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabaseSlowLogRecordsResponseBodySlowLogs self = new DescribeDatabaseSlowLogRecordsResponseBodySlowLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setLockTimes(Long lockTimes) {
            this.lockTimes = lockTimes;
            return this;
        }
        public Long getLockTimes() {
            return this.lockTimes;
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setParseRowCounts(Long parseRowCounts) {
            this.parseRowCounts = parseRowCounts;
            return this;
        }
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setQueryTimeMS(Long queryTimeMS) {
            this.queryTimeMS = queryTimeMS;
            return this;
        }
        public Long getQueryTimeMS() {
            return this.queryTimeMS;
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setQueryTimes(Long queryTimes) {
            this.queryTimes = queryTimes;
            return this;
        }
        public Long getQueryTimes() {
            return this.queryTimes;
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeDatabaseSlowLogRecordsResponseBodySlowLogs setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

    }

}
