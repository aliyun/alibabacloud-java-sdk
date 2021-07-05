// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogReportListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("Items")
    public DescribeSQLLogReportListResponseBodyItems items;

    public static DescribeSQLLogReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogReportListResponseBody self = new DescribeSQLLogReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeSQLLogReportListResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLLogReportListResponseBody setItems(DescribeSQLLogReportListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogReportListResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem extends TeaModel {
        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("SQLExecuteTimes")
        public Long SQLExecuteTimes;

        @NameInMap("AvgLatency")
        public Long avgLatency;

        public static DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem self = new DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItemsLatencyTopNItem setAvgLatency(Long avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Long getAvgLatency() {
            return this.avgLatency;
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
        @NameInMap("SQLExecuteTimes")
        public Long SQLExecuteTimes;

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
        @NameInMap("ReportTime")
        public String reportTime;

        @NameInMap("LatencyTopNItems")
        public DescribeSQLLogReportListResponseBodyItemsItemLatencyTopNItems latencyTopNItems;

        @NameInMap("QPSTopNItems")
        public DescribeSQLLogReportListResponseBodyItemsItemQPSTopNItems QPSTopNItems;

        public static DescribeSQLLogReportListResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseBodyItemsItem self = new DescribeSQLLogReportListResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseBodyItemsItem setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
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
