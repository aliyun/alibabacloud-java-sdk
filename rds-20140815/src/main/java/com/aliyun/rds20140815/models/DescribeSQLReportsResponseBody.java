// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLReportsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Items")
    public DescribeSQLReportsResponseBodyItems items;

    public static DescribeSQLReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLReportsResponseBody self = new DescribeSQLReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLReportsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLReportsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLReportsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLReportsResponseBody setItems(DescribeSQLReportsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLReportsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem extends TeaModel {
        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("AvgLatency")
        public Long avgLatency;

        @NameInMap("SQLExecuteTimes")
        public Long SQLExecuteTimes;

        public static DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem self = new DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setAvgLatency(Long avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Long getAvgLatency() {
            return this.avgLatency;
        }

        public DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

    }

    public static class DescribeSQLReportsResponseBodyItemsItemLatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        public java.util.List<DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem;

        public static DescribeSQLReportsResponseBodyItemsItemLatencyTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseBodyItemsItemLatencyTopNItems self = new DescribeSQLReportsResponseBodyItemsItemLatencyTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseBodyItemsItemLatencyTopNItems setLatencyTopNItem(java.util.List<DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem) {
            this.latencyTopNItem = latencyTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> getLatencyTopNItem() {
            return this.latencyTopNItem;
        }

    }

    public static class DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem extends TeaModel {
        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("SQLExecuteTimes")
        public Long SQLExecuteTimes;

        public static DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem self = new DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

    }

    public static class DescribeSQLReportsResponseBodyItemsItemQPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        public java.util.List<DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem;

        public static DescribeSQLReportsResponseBodyItemsItemQPSTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseBodyItemsItemQPSTopNItems self = new DescribeSQLReportsResponseBodyItemsItemQPSTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseBodyItemsItemQPSTopNItems setQPSTopNItem(java.util.List<DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem) {
            this.QPSTopNItem = QPSTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem> getQPSTopNItem() {
            return this.QPSTopNItem;
        }

    }

    public static class DescribeSQLReportsResponseBodyItemsItem extends TeaModel {
        @NameInMap("ReportTime")
        public String reportTime;

        @NameInMap("LatencyTopNItems")
        public DescribeSQLReportsResponseBodyItemsItemLatencyTopNItems latencyTopNItems;

        @NameInMap("QPSTopNItems")
        public DescribeSQLReportsResponseBodyItemsItemQPSTopNItems QPSTopNItems;

        public static DescribeSQLReportsResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseBodyItemsItem self = new DescribeSQLReportsResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseBodyItemsItem setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public DescribeSQLReportsResponseBodyItemsItem setLatencyTopNItems(DescribeSQLReportsResponseBodyItemsItemLatencyTopNItems latencyTopNItems) {
            this.latencyTopNItems = latencyTopNItems;
            return this;
        }
        public DescribeSQLReportsResponseBodyItemsItemLatencyTopNItems getLatencyTopNItems() {
            return this.latencyTopNItems;
        }

        public DescribeSQLReportsResponseBodyItemsItem setQPSTopNItems(DescribeSQLReportsResponseBodyItemsItemQPSTopNItems QPSTopNItems) {
            this.QPSTopNItems = QPSTopNItems;
            return this;
        }
        public DescribeSQLReportsResponseBodyItemsItemQPSTopNItems getQPSTopNItems() {
            return this.QPSTopNItems;
        }

    }

    public static class DescribeSQLReportsResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeSQLReportsResponseBodyItemsItem> item;

        public static DescribeSQLReportsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseBodyItems self = new DescribeSQLReportsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseBodyItems setItem(java.util.List<DescribeSQLReportsResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeSQLReportsResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
