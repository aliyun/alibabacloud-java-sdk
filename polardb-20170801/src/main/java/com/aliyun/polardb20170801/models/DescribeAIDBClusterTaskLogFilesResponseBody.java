// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTaskLogFilesResponseBody extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-15T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of logs.</p>
     */
    @NameInMap("Items")
    public DescribeAIDBClusterTaskLogFilesResponseBodyItems items;

    /**
     * <p>The page number of the returned page. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The total number of entries that meet the query conditions. This parameter is optional and may not be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The maximum number of records returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E2FE3BB-C677-5FF9-9FC5-9CF364BD6BE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range to query. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-15T14:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeAIDBClusterTaskLogFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTaskLogFilesResponseBody self = new DescribeAIDBClusterTaskLogFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTaskLogFilesResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAIDBClusterTaskLogFilesResponseBody setItems(DescribeAIDBClusterTaskLogFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAIDBClusterTaskLogFilesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeAIDBClusterTaskLogFilesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAIDBClusterTaskLogFilesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAIDBClusterTaskLogFilesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAIDBClusterTaskLogFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAIDBClusterTaskLogFilesResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems extends TeaModel {
        /**
         * <p>The time when the log was recorded.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-15T14:13:50.830295892Z</p>
         */
        @NameInMap("LogTime")
        public String logTime;

        /**
         * <p>The log message.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The specific point in time when the metric was recorded. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1765677660</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems self = new DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeAIDBClusterTaskLogFilesResponseBodyItems extends TeaModel {
        /**
         * <p>The SLS log information.</p>
         */
        @NameInMap("SlsLogItems")
        public java.util.List<DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems> slsLogItems;

        public static DescribeAIDBClusterTaskLogFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterTaskLogFilesResponseBodyItems self = new DescribeAIDBClusterTaskLogFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterTaskLogFilesResponseBodyItems setSlsLogItems(java.util.List<DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems> slsLogItems) {
            this.slsLogItems = slsLogItems;
            return this;
        }
        public java.util.List<DescribeAIDBClusterTaskLogFilesResponseBodyItemsSlsLogItems> getSlsLogItems() {
            return this.slsLogItems;
        }

    }

}
