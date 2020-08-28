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

    }

    public static class DescribeSQLLogReportListResponseItemsItemLatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportListResponseItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem;

        public static DescribeSQLLogReportListResponseItemsItemLatencyTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItemsItemLatencyTopNItems self = new DescribeSQLLogReportListResponseItemsItemLatencyTopNItems();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeSQLLogReportListResponseItemsItemQPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportListResponseItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem;

        public static DescribeSQLLogReportListResponseItemsItemQPSTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItemsItemQPSTopNItems self = new DescribeSQLLogReportListResponseItemsItemQPSTopNItems();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeSQLLogReportListResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportListResponseItemsItem> item;

        public static DescribeSQLLogReportListResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportListResponseItems self = new DescribeSQLLogReportListResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
