// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableMetricsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeAvailableMetricsResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAvailableMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMetricsResponseBody self = new DescribeAvailableMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMetricsResponseBody setItems(java.util.List<DescribeAvailableMetricsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAvailableMetricsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAvailableMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableMetricsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAvailableMetricsResponseBodyItems extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Dimension")
        public String dimension;

        @NameInMap("GroupKey")
        public String groupKey;

        @NameInMap("GroupKeyType")
        public String groupKeyType;

        @NameInMap("Method")
        public String method;

        @NameInMap("MetricsKey")
        public String metricsKey;

        @NameInMap("MetricsKeyAlias")
        public String metricsKeyAlias;

        @NameInMap("SortRule")
        public Integer sortRule;

        @NameInMap("Unit")
        public String unit;

        public static DescribeAvailableMetricsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableMetricsResponseBodyItems self = new DescribeAvailableMetricsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableMetricsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAvailableMetricsResponseBodyItems setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeAvailableMetricsResponseBodyItems setGroupKey(String groupKey) {
            this.groupKey = groupKey;
            return this;
        }
        public String getGroupKey() {
            return this.groupKey;
        }

        public DescribeAvailableMetricsResponseBodyItems setGroupKeyType(String groupKeyType) {
            this.groupKeyType = groupKeyType;
            return this;
        }
        public String getGroupKeyType() {
            return this.groupKeyType;
        }

        public DescribeAvailableMetricsResponseBodyItems setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeAvailableMetricsResponseBodyItems setMetricsKey(String metricsKey) {
            this.metricsKey = metricsKey;
            return this;
        }
        public String getMetricsKey() {
            return this.metricsKey;
        }

        public DescribeAvailableMetricsResponseBodyItems setMetricsKeyAlias(String metricsKeyAlias) {
            this.metricsKeyAlias = metricsKeyAlias;
            return this;
        }
        public String getMetricsKeyAlias() {
            return this.metricsKeyAlias;
        }

        public DescribeAvailableMetricsResponseBodyItems setSortRule(Integer sortRule) {
            this.sortRule = sortRule;
            return this;
        }
        public Integer getSortRule() {
            return this.sortRule;
        }

        public DescribeAvailableMetricsResponseBodyItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
