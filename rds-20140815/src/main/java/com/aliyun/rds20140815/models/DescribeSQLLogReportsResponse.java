// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogReportsResponse extends TeaModel {
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
    public DescribeSQLLogReportsResponseItems items;

    public static DescribeSQLLogReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogReportsResponse self = new DescribeSQLLogReportsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSQLLogReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem extends TeaModel {
        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("AvgLatency")
        @Validation(required = true)
        public Long avgLatency;

        @NameInMap("SQLExecuteTimes")
        @Validation(required = true)
        public Long SQLExecuteTimes;

        public static DescribeSQLLogReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem self = new DescribeSQLLogReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLLogReportsResponseItemsItemLatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem;

        public static DescribeSQLLogReportsResponseItemsItemLatencyTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseItemsItemLatencyTopNItems self = new DescribeSQLLogReportsResponseItemsItemLatencyTopNItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLLogReportsResponseItemsItemQPSTopNItemsQPSTopNItem extends TeaModel {
        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("SQLExecuteTimes")
        @Validation(required = true)
        public Long SQLExecuteTimes;

        public static DescribeSQLLogReportsResponseItemsItemQPSTopNItemsQPSTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseItemsItemQPSTopNItemsQPSTopNItem self = new DescribeSQLLogReportsResponseItemsItemQPSTopNItemsQPSTopNItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLLogReportsResponseItemsItemQPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportsResponseItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem;

        public static DescribeSQLLogReportsResponseItemsItemQPSTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseItemsItemQPSTopNItems self = new DescribeSQLLogReportsResponseItemsItemQPSTopNItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLLogReportsResponseItemsItem extends TeaModel {
        @NameInMap("ReportTime")
        @Validation(required = true)
        public String reportTime;

        @NameInMap("LatencyTopNItems")
        @Validation(required = true)
        public DescribeSQLLogReportsResponseItemsItemLatencyTopNItems latencyTopNItems;

        @NameInMap("QPSTopNItems")
        @Validation(required = true)
        public DescribeSQLLogReportsResponseItemsItemQPSTopNItems QPSTopNItems;

        public static DescribeSQLLogReportsResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseItemsItem self = new DescribeSQLLogReportsResponseItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLLogReportsResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogReportsResponseItemsItem> item;

        public static DescribeSQLLogReportsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogReportsResponseItems self = new DescribeSQLLogReportsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
