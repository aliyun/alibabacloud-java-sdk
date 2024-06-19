// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeRunningLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The type of the database engine.</p>
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
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Details about the log entries.</p>
     */
    @NameInMap("Items")
    public DescribeRunningLogRecordsResponseBodyItems items;

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
     * <p>5</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The maximum number of entries returned on each page.</p>
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
     * <p>093B8579-9264-43A0-ABA9-AA86****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-12-03T07:01Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeRunningLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningLogRecordsResponseBody self = new DescribeRunningLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRunningLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeRunningLogRecordsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRunningLogRecordsResponseBody setItems(DescribeRunningLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeRunningLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeRunningLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRunningLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeRunningLogRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRunningLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRunningLogRecordsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRunningLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeRunningLogRecordsResponseBodyItemsLogRecords extends TeaModel {
        /**
         * <p>The content of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>CONFIG REWRITE executed with success.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the log was generated. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-03T07:07:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the node.</p>
         * <blockquote>
         * <p> If a standard instance is queried, <code>(null)</code> is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeRunningLogRecordsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeRunningLogRecordsResponseBodyItemsLogRecords self = new DescribeRunningLogRecordsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeRunningLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("LogRecords")
        public java.util.List<DescribeRunningLogRecordsResponseBodyItemsLogRecords> logRecords;

        public static DescribeRunningLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRunningLogRecordsResponseBodyItems self = new DescribeRunningLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRunningLogRecordsResponseBodyItems setLogRecords(java.util.List<DescribeRunningLogRecordsResponseBodyItemsLogRecords> logRecords) {
            this.logRecords = logRecords;
            return this;
        }
        public java.util.List<DescribeRunningLogRecordsResponseBodyItemsLogRecords> getLogRecords() {
            return this.logRecords;
        }

    }

}
