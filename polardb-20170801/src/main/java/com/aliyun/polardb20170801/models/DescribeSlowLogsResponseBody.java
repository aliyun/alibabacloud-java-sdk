// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSlowLogsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("Items")
    public DescribeSlowLogsResponseBodyItems items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("DBNodeId")
        public String DBNodeId;

        @NameInMap("MaxExecutionTime")
        public Long maxExecutionTime;

        @NameInMap("MaxLockTime")
        public Long maxLockTime;

        @NameInMap("ParseMaxRowCount")
        public Long parseMaxRowCount;

        @NameInMap("ParseTotalRowCounts")
        public Long parseTotalRowCounts;

        @NameInMap("ReturnMaxRowCount")
        public Long returnMaxRowCount;

        @NameInMap("ReturnTotalRowCounts")
        public Long returnTotalRowCounts;

        @NameInMap("SQLHASH")
        public String SQLHASH;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("TotalExecutionCounts")
        public Long totalExecutionCounts;

        @NameInMap("TotalExecutionTimes")
        public Long totalExecutionTimes;

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
