// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Long totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSQLLogRecordsResponseItems items;

    public static DescribeSQLLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsResponse self = new DescribeSQLLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogRecordsResponse setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLLogRecordsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogRecordsResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogRecordsResponse setItems(DescribeSQLLogRecordsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogRecordsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeSQLLogRecordsResponseItemsSQLRecord extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("HostAddress")
        @Validation(required = true)
        public String hostAddress;

        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("TotalExecutionTimes")
        @Validation(required = true)
        public Long totalExecutionTimes;

        @NameInMap("ReturnRowCounts")
        @Validation(required = true)
        public Long returnRowCounts;

        @NameInMap("ExecuteTime")
        @Validation(required = true)
        public String executeTime;

        @NameInMap("ThreadID")
        @Validation(required = true)
        public String threadID;

        public static DescribeSQLLogRecordsResponseItemsSQLRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseItemsSQLRecord self = new DescribeSQLLogRecordsResponseItemsSQLRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogRecordsResponseItemsSQLRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSQLLogRecordsResponseItemsSQLRecord setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSQLLogRecordsResponseItemsSQLRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSQLLogRecordsResponseItemsSQLRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogRecordsResponseItemsSQLRecord setTotalExecutionTimes(Long totalExecutionTimes) {
            this.totalExecutionTimes = totalExecutionTimes;
            return this;
        }
        public Long getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

        public DescribeSQLLogRecordsResponseItemsSQLRecord setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSQLLogRecordsResponseItemsSQLRecord setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSQLLogRecordsResponseItemsSQLRecord setThreadID(String threadID) {
            this.threadID = threadID;
            return this;
        }
        public String getThreadID() {
            return this.threadID;
        }

    }

    public static class DescribeSQLLogRecordsResponseItems extends TeaModel {
        @NameInMap("SQLRecord")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogRecordsResponseItemsSQLRecord> SQLRecord;

        public static DescribeSQLLogRecordsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseItems self = new DescribeSQLLogRecordsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogRecordsResponseItems setSQLRecord(java.util.List<DescribeSQLLogRecordsResponseItemsSQLRecord> SQLRecord) {
            this.SQLRecord = SQLRecord;
            return this;
        }
        public java.util.List<DescribeSQLLogRecordsResponseItemsSQLRecord> getSQLRecord() {
            return this.SQLRecord;
        }

    }

}
