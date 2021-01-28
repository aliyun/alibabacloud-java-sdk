// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeRunningLogRecordsResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Items")
    public DescribeRunningLogRecordsResponseBodyItems items;

    @NameInMap("Engine")
    public String engine;

    public static DescribeRunningLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningLogRecordsResponseBody self = new DescribeRunningLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRunningLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeRunningLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeRunningLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRunningLogRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRunningLogRecordsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRunningLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRunningLogRecordsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRunningLogRecordsResponseBody setItems(DescribeRunningLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeRunningLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeRunningLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public static class DescribeRunningLogRecordsResponseBodyItemsLogRecords extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Content")
        public String content;

        public static DescribeRunningLogRecordsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeRunningLogRecordsResponseBodyItemsLogRecords self = new DescribeRunningLogRecordsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
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

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
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
