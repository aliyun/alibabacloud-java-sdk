// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLReportsResponse extends TeaModel {
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
    public DescribeSQLReportsResponseItems items;

    public static DescribeSQLReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLReportsResponse self = new DescribeSQLReportsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem extends TeaModel {
        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("AvgLatency")
        @Validation(required = true)
        public Long avgLatency;

        @NameInMap("SQLExecuteTimes")
        @Validation(required = true)
        public Long SQLExecuteTimes;

        public static DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem self = new DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLReportsResponseItemsItemLatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem;

        public static DescribeSQLReportsResponseItemsItemLatencyTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItemLatencyTopNItems self = new DescribeSQLReportsResponseItemsItemLatencyTopNItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem extends TeaModel {
        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("SQLExecuteTimes")
        @Validation(required = true)
        public Long SQLExecuteTimes;

        public static DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem self = new DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLReportsResponseItemsItemQPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem;

        public static DescribeSQLReportsResponseItemsItemQPSTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItemQPSTopNItems self = new DescribeSQLReportsResponseItemsItemQPSTopNItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLReportsResponseItemsItem extends TeaModel {
        @NameInMap("ReportTime")
        @Validation(required = true)
        public String reportTime;

        @NameInMap("LatencyTopNItems")
        @Validation(required = true)
        public DescribeSQLReportsResponseItemsItemLatencyTopNItems latencyTopNItems;

        @NameInMap("QPSTopNItems")
        @Validation(required = true)
        public DescribeSQLReportsResponseItemsItemQPSTopNItems QPSTopNItems;

        public static DescribeSQLReportsResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItem self = new DescribeSQLReportsResponseItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLReportsResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeSQLReportsResponseItemsItem> item;

        public static DescribeSQLReportsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItems self = new DescribeSQLReportsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
