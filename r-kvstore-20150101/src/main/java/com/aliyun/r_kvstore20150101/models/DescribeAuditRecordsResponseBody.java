// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsResponseBody extends TeaModel {
    /**
     * <p>The end of the time range that is specified to query the audit log.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the ApsaraDB for Redis instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The collection of returned audit log entries.</p>
     */
    @NameInMap("Items")
    public DescribeAuditRecordsResponseBodyItems items;

    /**
     * <p>The page number of the page returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of log entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range that is specified to query the audit log.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of log entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAuditRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditRecordsResponseBody self = new DescribeAuditRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditRecordsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAuditRecordsResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeAuditRecordsResponseBody setItems(DescribeAuditRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAuditRecordsResponseBodyItems getItems() {
        return this.items;
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

    public DescribeAuditRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditRecordsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAuditRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAuditRecordsResponseBodyItemsSQL extends TeaModel {
        /**
         * <p>The name of the account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The time when the command was run.</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The client IP address.</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The ID of the node.</p>
         * <br>
         * <p>>  A specific node ID is returned only if a cluster or read/write splitting instance is used.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The command that was run.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The type of command.</p>
         */
        @NameInMap("SQLType")
        public String SQLType;

        /**
         * <p>The amount of time that is consumed to run the command.</p>
         */
        @NameInMap("TotalExecutionTimes")
        public String totalExecutionTimes;

        public static DescribeAuditRecordsResponseBodyItemsSQL build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditRecordsResponseBodyItemsSQL self = new DescribeAuditRecordsResponseBodyItemsSQL();
            return TeaModel.build(map, self);
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeAuditRecordsResponseBodyItemsSQL setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
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
