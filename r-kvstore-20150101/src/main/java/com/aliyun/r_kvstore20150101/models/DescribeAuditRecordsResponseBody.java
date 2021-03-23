// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Items")
    public DescribeAuditRecordsResponseBodyItems items;

    public static DescribeAuditRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditRecordsResponseBody self = new DescribeAuditRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuditRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeAuditRecordsResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeAuditRecordsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAuditRecordsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAuditRecordsResponseBody setItems(DescribeAuditRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAuditRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeAuditRecordsResponseBodyItemsSQL extends TeaModel {
        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("SQLType")
        public String SQLType;

        @NameInMap("TotalExecutionTimes")
        public String totalExecutionTimes;

        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeAuditRecordsResponseBodyItemsSQL build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditRecordsResponseBodyItemsSQL self = new DescribeAuditRecordsResponseBodyItemsSQL();
            return TeaModel.build(map, self);
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setSQLType(String SQLType) {
            this.SQLType = SQLType;
            return this;
        }
        public String getSQLType() {
            return this.SQLType;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setTotalExecutionTimes(String totalExecutionTimes) {
            this.totalExecutionTimes = totalExecutionTimes;
            return this;
        }
        public String getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

    public static class DescribeAuditRecordsResponseBodyItems extends TeaModel {
        @NameInMap("SQL")
        public java.util.List<DescribeAuditRecordsResponseBodyItemsSQL> SQL;

        public static DescribeAuditRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditRecordsResponseBodyItems self = new DescribeAuditRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAuditRecordsResponseBodyItems setSQL(java.util.List<DescribeAuditRecordsResponseBodyItemsSQL> SQL) {
            this.SQL = SQL;
            return this;
        }
        public java.util.List<DescribeAuditRecordsResponseBodyItemsSQL> getSQL() {
            return this.SQL;
        }

    }

}
