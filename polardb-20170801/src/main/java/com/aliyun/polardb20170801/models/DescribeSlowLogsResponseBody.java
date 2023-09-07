// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSlowLogsResponseBody extends TeaModel {
    /**
     * <p>The ID of cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end date of the query.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the database engine.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>Details about slow query logs.</p>
     */
    @NameInMap("Items")
    public DescribeSlowLogsResponseBodyItems items;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of SQL statements that are returned on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start date of the query.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeSlowLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogsResponseBody self = new DescribeSlowLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSlowLogsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public DescribeSlowLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowLogsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSlowLogsResponseBodyItemsSQLSlowLog extends TeaModel {
        /**
         * <p>The date when the data was generated.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The longest execution duration of a specific SQL statement in the query. Unit: seconds.</p>
         */
        @NameInMap("MaxExecutionTime")
        public Long maxExecutionTime;

        /**
         * <p>The longest lock duration that was caused by a specific SQL statement in the query. Unit: seconds.</p>
         */
        @NameInMap("MaxLockTime")
        public Long maxLockTime;

        /**
         * <p>The largest number of rows that were parsed by a specific SQL statement in the query.</p>
         */
        @NameInMap("ParseMaxRowCount")
        public Long parseMaxRowCount;

        /**
         * <p>The total number of rows that were parsed by all SQL statements in the query.</p>
         */
        @NameInMap("ParseTotalRowCounts")
        public Long parseTotalRowCounts;

        /**
         * <p>The largest number of rows that were returned by a specific SQL statement in the query.</p>
         */
        @NameInMap("ReturnMaxRowCount")
        public Long returnMaxRowCount;

        /**
         * <p>The total number of rows that were returned by all SQL statements in the query.</p>
         */
        @NameInMap("ReturnTotalRowCounts")
        public Long returnTotalRowCounts;

        /**
         * <p>The unique ID of the SQL statement. The ID is used to obtain the slow query logs of the SQL statement.</p>
         */
        @NameInMap("SQLHASH")
        public String SQLHASH;

        /**
         * <p>The SQL statement that is executed in the query.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The total number of executions of the SQL statements.</p>
         */
        @NameInMap("TotalExecutionCounts")
        public Long totalExecutionCounts;

        /**
         * <p>The total duration that was caused by all SQL statements in the query. Unit: seconds.</p>
         */
        @NameInMap("TotalExecutionTimes")
        public Long totalExecutionTimes;

        /**
         * <p>The total lock duration that was caused by all SQL statements in the query. Unit: seconds.</p>
         */
        @NameInMap("TotalLockTimes")
        public Long totalLockTimes;

        public static DescribeSlowLogsResponseBodyItemsSQLSlowLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogsResponseBodyItemsSQLSlowLog self = new DescribeSlowLogsResponseBodyItemsSQLSlowLog();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxExecutionTime(Long maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            return this;
        }
        public Long getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setMaxLockTime(Long maxLockTime) {
            this.maxLockTime = maxLockTime;
            return this;
        }
        public Long getMaxLockTime() {
            return this.maxLockTime;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setParseMaxRowCount(Long parseMaxRowCount) {
            this.parseMaxRowCount = parseMaxRowCount;
            return this;
        }
        public Long getParseMaxRowCount() {
            return this.parseMaxRowCount;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setParseTotalRowCounts(Long parseTotalRowCounts) {
            this.parseTotalRowCounts = parseTotalRowCounts;
            return this;
        }
        public Long getParseTotalRowCounts() {
            return this.parseTotalRowCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setReturnMaxRowCount(Long returnMaxRowCount) {
            this.returnMaxRowCount = returnMaxRowCount;
            return this;
        }
        public Long getReturnMaxRowCount() {
            return this.returnMaxRowCount;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setReturnTotalRowCounts(Long returnTotalRowCounts) {
            this.returnTotalRowCounts = returnTotalRowCounts;
            return this;
        }
        public Long getReturnTotalRowCounts() {
            return this.returnTotalRowCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLHASH(String SQLHASH) {
            this.SQLHASH = SQLHASH;
            return this;
        }
        public String getSQLHASH() {
            return this.SQLHASH;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalExecutionCounts(Long totalExecutionCounts) {
            this.totalExecutionCounts = totalExecutionCounts;
            return this;
        }
        public Long getTotalExecutionCounts() {
            return this.totalExecutionCounts;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalExecutionTimes(Long totalExecutionTimes) {
            this.totalExecutionTimes = totalExecutionTimes;
            return this;
        }
        public Long getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

        public DescribeSlowLogsResponseBodyItemsSQLSlowLog setTotalLockTimes(Long totalLockTimes) {
            this.totalLockTimes = totalLockTimes;
            return this;
        }
        public Long getTotalLockTimes() {
            return this.totalLockTimes;
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
