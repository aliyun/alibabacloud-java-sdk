// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The database engine that the instance runs.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp10n********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The slow query log entries.</p>
     */
    @NameInMap("Items")
    public DescribeSlowLogRecordsResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of log entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The maximum number of log entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>686BB8A6-BBA5-47E5-8A75-D2ADE433****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-10T13:11Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of returned log entries.</p>
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

    public DescribeSlowLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSlowLogRecordsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public DescribeSlowLogRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSlowLogRecordsResponseBodyItemsLogRecords extends TeaModel {
        /**
         * <p>The ID of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The slow query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>KEYS *</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The database name. This parameter serves the same purpose as the <strong>DBName</strong> parameter. We recommend that you use the <strong>DBName</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("DataBaseName")
        public String dataBaseName;

        /**
         * <p>The amount of time consumed to execute the slow query statement. Unit: microseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>248</p>
         */
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        /**
         * <p>The start time when the slow query statement was executed. The time is displayed in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-20T09:18:41Z</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeSlowLogRecordsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItemsLogRecords self = new DescribeSlowLogRecordsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setDataBaseName(String dataBaseName) {
            this.dataBaseName = dataBaseName;
            return this;
        }
        public String getDataBaseName() {
            return this.dataBaseName;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeSlowLogRecordsResponseBodyItemsLogRecords setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("LogRecords")
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsLogRecords> logRecords;

        public static DescribeSlowLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItems self = new DescribeSlowLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItems setLogRecords(java.util.List<DescribeSlowLogRecordsResponseBodyItemsLogRecords> logRecords) {
            this.logRecords = logRecords;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodyItemsLogRecords> getLogRecords() {
            return this.logRecords;
        }

    }

}
