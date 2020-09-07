// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogReportListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSQLLogReportListResponseItems items;

    public static DescribeSQLLogReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogReportListResponse self = new DescribeSQLLogReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogReportListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogReportListResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLLogReportListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogReportListResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogReportListResponse setItems(DescribeSQLLogReportListResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogReportListResponseItems getItems() {
        return this.items;
    }

    public static class DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem extends TeaModel {
        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("AvgLatency")
        @Validation(required = true)
        public Long avgLatency;

        @NameInMap("SQLExecuteTimes")
        @Validation(required = true)
        public Long SQLExecuteTimes;

        public static DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem self = new DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem setAvgLatency(Long avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Long getAvgLatency() {
            return this.avgLatency;
        }

        public DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

    }

    public static class DescribeSQLLogReportListResponseItemsItemLatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem;

        public static DescribeSQLLogReportListResponseItemsItemLatencyTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItemsItemLatencyTopNItems self = new DescribeSQLLogReportListResponseItemsItemLatencyTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseItemsItemLatencyTopNItems setLatencyTopNItem(java.util.List<DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem) {
            this.latencyTopNItem = latencyTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem> getLatencyTopNItem() {
            return this.latencyTopNItem;
        }

    }

    public static class DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem extends TeaModel {
        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("SQLExecuteTimes")
        @Validation(required = true)
        public Long SQLExecuteTimes;

        public static DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem self = new DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

    }

    public static class DescribeSQLLogReportListResponseItemsItemQPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem;

        public static DescribeSQLLogReportListResponseItemsItemQPSTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItemsItemQPSTopNItems self = new DescribeSQLLogReportListResponseItemsItemQPSTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseItemsItemQPSTopNItems setQPSTopNItem(java.util.List<DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem) {
            this.QPSTopNItem = QPSTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem> getQPSTopNItem() {
            return this.QPSTopNItem;
        }

    }

    public static class DescribeSQLLogReportListResponseItemsItem extends TeaModel {
        @NameInMap("ReportTime")
        @Validation(required = true)
        public String reportTime;

        @NameInMap("LatencyTopNItems")
        @Validation(required = true)
        public DescribeSQLLogReportListResponseItemsItemLatencyTopNItems latencyTopNItems;

        @NameInMap("QPSTopNItems")
        @Validation(required = true)
        public DescribeSQLLogReportListResponseItemsItemQPSTopNItems QPSTopNItems;

        public static DescribeSQLLogReportListResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItemsItem self = new DescribeSQLLogReportListResponseItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseItemsItem setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public DescribeSQLLogReportListResponseItemsItem setLatencyTopNItems(DescribeSQLLogReportListResponseItemsItemLatencyTopNItems latencyTopNItems) {
            this.latencyTopNItems = latencyTopNItems;
            return this;
        }
        public DescribeSQLLogReportListResponseItemsItemLatencyTopNItems getLatencyTopNItems() {
            return this.latencyTopNItems;
        }

        public DescribeSQLLogReportListResponseItemsItem setQPSTopNItems(DescribeSQLLogReportListResponseItemsItemQPSTopNItems QPSTopNItems) {
            this.QPSTopNItems = QPSTopNItems;
            return this;
        }
        public DescribeSQLLogReportListResponseItemsItemQPSTopNItems getQPSTopNItems() {
            return this.QPSTopNItems;
        }

    }

    public static class DescribeSQLLogReportListResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportListResponseItemsItem> item;

        public static DescribeSQLLogReportListResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItems self = new DescribeSQLLogReportListResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogReportListResponseItems setItem(java.util.List<DescribeSQLLogReportListResponseItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeSQLLogReportListResponseItemsItem> getItem() {
            return this.item;
        }

    }

}
