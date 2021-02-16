// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsResponseBody extends TeaModel {
    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    @NameInMap("DBInstanceID")
    public String DBInstanceID;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    @NameInMap("Items")
    public DescribeSQLLogRecordsResponseBodyItems items;

    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    @NameInMap("Finish")
    public String finish;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("PagingID")
    public String pagingID;

    public static DescribeSQLLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsResponseBody self = new DescribeSQLLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRecordsResponseBody setItemsNumbers(Integer itemsNumbers) {
        this.itemsNumbers = itemsNumbers;
        return this;
    }
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    public DescribeSQLLogRecordsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogRecordsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogRecordsResponseBody setMaxRecordsPerPage(Integer maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeSQLLogRecordsResponseBody setDBInstanceID(String DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    public DescribeSQLLogRecordsResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public DescribeSQLLogRecordsResponseBody setItems(DescribeSQLLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSQLLogRecordsResponseBody setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeSQLLogRecordsResponseBody setFinish(String finish) {
        this.finish = finish;
        return this;
    }
    public String getFinish() {
        return this.finish;
    }

    public DescribeSQLLogRecordsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeSQLLogRecordsResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSQLLogRecordsResponseBody setPagingID(String pagingID) {
        this.pagingID = pagingID;
        return this;
    }
    public String getPagingID() {
        return this.pagingID;
    }

    public static class DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord extends TeaModel {
        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("UpdateRows")
        public Long updateRows;

        @NameInMap("State")
        public String state;

        @NameInMap("ThreadID")
        public Integer threadID;

        @NameInMap("OriginTime")
        public String originTime;

        @NameInMap("InsName")
        public String insName;

        @NameInMap("ScanRows")
        public Long scanRows;

        @NameInMap("Consume")
        public Long consume;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("Vip")
        public String vip;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("SqlType")
        public String sqlType;

        public static DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord self = new DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setUpdateRows(Long updateRows) {
            this.updateRows = updateRows;
            return this;
        }
        public Long getUpdateRows() {
            return this.updateRows;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setThreadID(Integer threadID) {
            this.threadID = threadID;
            return this;
        }
        public Integer getThreadID() {
            return this.threadID;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setOriginTime(String originTime) {
            this.originTime = originTime;
            return this;
        }
        public String getOriginTime() {
            return this.originTime;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

    public static class DescribeSQLLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("SQLLogRecord")
        public java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord> SQLLogRecord;

        public static DescribeSQLLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseBodyItems self = new DescribeSQLLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogRecordsResponseBodyItems setSQLLogRecord(java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord> SQLLogRecord) {
            this.SQLLogRecord = SQLLogRecord;
            return this;
        }
        public java.util.List<DescribeSQLLogRecordsResponseBodyItemsSQLLogRecord> getSQLLogRecord() {
            return this.SQLLogRecord;
        }

    }

}
