// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogReportListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of SQL log reports.</p>
     */
    @NameInMap("Items")
    public DescribeSQLLogReportListResponseBodyItems items;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of SQL log reports on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeSQLLogReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogReportListResponseBody self = new DescribeSQLLogReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogReportListResponseBody setItems(DescribeSQLLogReportListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogReportListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSQLLogReportListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogReportListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogReportListResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem extends TeaModel {
        /**
         * <p>The average time that is required to execute the SQL statement. Unit: milliseconds.</p>
         */
        @NameInMap("AvgLatency")
        public Long avgLatency;

        /**
         * <p>The number of times that the SQL statement is executed.</p>
         */
        @NameInMap("SQLExecuteTimes")
        public Long SQLExecuteTimes;

        /**
         * <p>The SQL statement.</p>
         * <br>
         * <p>>  Only the first 128 characters of the SQL statement are returned. In addition, only the SQL statements that take more than 100 ms to execute are returned.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        public static DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem self = new DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setAvgLatency(Long avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Long getAvgLatency() {
            return this.avgLatency;
        }

        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

    }

    public static class DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        public java.util.List<DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem;

        public static DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems self = new DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems setLatencyTopNItem(java.util.List<DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem) {
            this.latencyTopNItem = latencyTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> getLatencyTopNItem() {
            return this.latencyTopNItem;
        }

    }

    public static class DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem extends TeaModel {
        /**
         * <p>The number of times that the SQL statement is executed.</p>
         */
        @NameInMap("SQLExecuteTimes")
        public Long SQLExecuteTimes;

        /**
         * <p>The SQL statement.</p>
         * <br>
         * <p>>  Only the first 128 characters of the SQL statement are returned. In addition, only the SQL statements that take more than 5 ms to execute are returned.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        public static DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem self = new DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

        public DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

    }

    public static class DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        public java.util.List<DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem;

        public static DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems self = new DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems setQPSTopNItem(java.util.List<DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem) {
            this.QPSTopNItem = QPSTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItemsQPSTopNItem> getQPSTopNItem() {
            return this.QPSTopNItem;
        }

    }

    public static class DescribeSQLLogReportListResponseBodyItemsItem extends TeaModel {
        /**
         * <p>An array that consists of SQL statements executed with the highest latency.</p>
         */
        @NameInMap("LatencyTopNItems")
        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems latencyTopNItems;

        /**
         * <p>An array that consists of SQL statements executed the most frequently.</p>
         */
        @NameInMap("QPSTopNItems")
        public DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems QPSTopNItems;

        /**
         * <p>The time when the report was generated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ReportTime")
        public String reportTime;

        public static DescribeSQLLogReportListResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseBodyItemsItem self = new DescribeSQLLogReportListResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseBodyItemsItem setLatencyTopNItems(DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems latencyTopNItems) {
            this.latencyTopNItems = latencyTopNItems;
            return this;
        }
        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems getLatencyTopNItems() {
            return this.latencyTopNItems;
        }

        public DescribeSQLLogReportListResponseBodyItemsItem setQPSTopNItems(DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems QPSTopNItems) {
            this.QPSTopNItems = QPSTopNItems;
            return this;
        }
        public DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems getQPSTopNItems() {
            return this.QPSTopNItems;
        }

        public DescribeSQLLogReportListResponseBodyItemsItem setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

    }

    public static class DescribeSQLLogReportListResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeSQLLogReportListResponseBodyItemsItem> item;

        public static DescribeSQLLogReportListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseBodyItems self = new DescribeSQLLogReportListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseBodyItems setItem(java.util.List<DescribeSQLLogReportListResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeSQLLogReportListResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
