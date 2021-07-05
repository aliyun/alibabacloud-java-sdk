// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogReportsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("Items")
    public DescribeSQLLogReportsResponseBodyItems items;

    public static DescribeSQLLogReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogReportsResponseBody self = new DescribeSQLLogReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogReportsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogReportsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogReportsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLLogReportsResponseBody setItems(DescribeSQLLogReportsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogReportsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem extends TeaModel {
        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("SQLExecuteTimes")
        public Long SQLExecuteTimes;

        @NameInMap("AvgLatency")
        public Long avgLatency;

        public static DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem self = new DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

        public DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setAvgLatency(Long avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Long getAvgLatency() {
            return this.avgLatency;
        }

    }

    public static class DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        public java.util.List<DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem;

        public static DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItems self = new DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItems setLatencyTopNItem(java.util.List<DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem) {
            this.latencyTopNItem = latencyTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem> getLatencyTopNItem() {
            return this.latencyTopNItem;
        }

    }

    public static class DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem extends TeaModel {
        @NameInMap("SQLExecuteTimes")
        public Long SQLExecuteTimes;

        @NameInMap("SQLText")
        public String SQLText;

        public static DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem self = new DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

        public DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

    }

    public static class DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        public java.util.List<DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem;

        public static DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItems self = new DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItems setQPSTopNItem(java.util.List<DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem) {
            this.QPSTopNItem = QPSTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItemsQPSTopNItem> getQPSTopNItem() {
            return this.QPSTopNItem;
        }

    }

    public static class DescribeSQLLogReportsResponseBodyItemsItem extends TeaModel {
        @NameInMap("ReportTime")
        public String reportTime;

        @NameInMap("LatencyTopNItems")
        public DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItems latencyTopNItems;

        @NameInMap("QPSTopNItems")
        public DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItems QPSTopNItems;

        public static DescribeSQLLogReportsResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseBodyItemsItem self = new DescribeSQLLogReportsResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportsResponseBodyItemsItem setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public DescribeSQLLogReportsResponseBodyItemsItem setLatencyTopNItems(DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItems latencyTopNItems) {
            this.latencyTopNItems = latencyTopNItems;
            return this;
        }
        public DescribeSQLLogReportsResponseBodyItemsItemLatencyTopNItems getLatencyTopNItems() {
            return this.latencyTopNItems;
        }

        public DescribeSQLLogReportsResponseBodyItemsItem setQPSTopNItems(DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItems QPSTopNItems) {
            this.QPSTopNItems = QPSTopNItems;
            return this;
        }
        public DescribeSQLLogReportsResponseBodyItemsItemQPSTopNItems getQPSTopNItems() {
            return this.QPSTopNItems;
        }

    }

    public static class DescribeSQLLogReportsResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeSQLLogReportsResponseBodyItemsItem> item;

        public static DescribeSQLLogReportsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseBodyItems self = new DescribeSQLLogReportsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportsResponseBodyItems setItem(java.util.List<DescribeSQLLogReportsResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeSQLLogReportsResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
