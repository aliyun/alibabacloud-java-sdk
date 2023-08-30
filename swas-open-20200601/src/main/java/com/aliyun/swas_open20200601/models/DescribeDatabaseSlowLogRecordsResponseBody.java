// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The database engine that the instance runs.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 30 to 100.</p>
     * <br>
     * <p>Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of logical reads.</p>
     */
    @NameInMap("PhysicalIORead")
    public Long physicalIORead;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The database name.</p>
     */
    @NameInMap("SlowLogs")
    public java.util.List<DescribeDatabaseSlowLogRecordsResponseBodySlowLogs> slowLogs;

    /**
     * <p>The total number of entries returned.</p>
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
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("LockTimes")
        public Long lockTimes;

        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        @NameInMap("QueryTimeMS")
        public Long queryTimeMS;

        @NameInMap("QueryTimes")
        public Long queryTimes;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

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
