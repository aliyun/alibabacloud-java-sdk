// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The details about each SQL audit log entry.</p>
     */
    @NameInMap("Items")
    public DescribeSQLLogRecordsResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of SQL audit log entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeSQLLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsResponseBody self = new DescribeSQLLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRecordsResponseBody setItems(DescribeSQLLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSQLLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogRecordsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSQLLogRecordsResponseBodyItemsSQLRecord extends TeaModel {
        /**
         * <p>The username of the account that is recorded in the SQL audit log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>accounttest</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The time at which the SQL statement was executed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-06-11T15:00:23Z</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The IP address of the client that is connected to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.121</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The number of SQL audit log entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>update test.zxb set id=0 limit 1</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The thread ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1025865428</p>
         */
        @NameInMap("ThreadID")
        public String threadID;

        /**
         * <p>The execution duration of the SQL statement. Unit: microseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("TotalExecutionTimes")
        public Long totalExecutionTimes;

        public static DescribeSQLLogRecordsResponseBodyItemsSQLRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseBodyItemsSQLRecord self = new DescribeSQLLogRecordsResponseBodyItemsSQLRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setThreadID(String threadID) {
            this.threadID = threadID;
            return this;
        }
        public String getThreadID() {
            return this.threadID;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLRecord setTotalExecutionTimes(Long totalExecutionTimes) {
            this.totalExecutionTimes = totalExecutionTimes;
            return this;
        }
        public Long getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

    }

    public static class DescribeSQLLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("SQLRecord")
        public java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLRecord> SQLRecord;

        public static DescribeSQLLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseBodyItems self = new DescribeSQLLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogRecordsResponseBodyItems setSQLRecord(java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLRecord> SQLRecord) {
            this.SQLRecord = SQLRecord;
            return this;
        }
        public java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLRecord> getSQLRecord() {
            return this.SQLRecord;
        }

    }

}
