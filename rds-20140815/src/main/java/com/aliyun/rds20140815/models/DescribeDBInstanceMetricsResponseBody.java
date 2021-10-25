// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMetricsResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceMetricsResponseBodyItems> items;

    public static DescribeDBInstanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMetricsResponseBody self = new DescribeDBInstanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMetricsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBInstanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceMetricsResponseBody setItems(java.util.List<DescribeDBInstanceMetricsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBInstanceMetricsResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeDBInstanceMetricsResponseBodyItems extends TeaModel {
        @NameInMap("GroupKey")
        public String groupKey;

        @NameInMap("SortRule")
        public Integer sortRule;

        @NameInMap("Description")
        public String description;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("MetricsKey")
        public String metricsKey;

        @NameInMap("GroupKeyType")
        public String groupKeyType;

        @NameInMap("Method")
        public String method;

        @NameInMap("Dimension")
        public String dimension;

        @NameInMap("MetricsKeyAlias")
        public String metricsKeyAlias;

        public static DescribeDBInstanceMetricsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceMetricsResponseBodyItems self = new DescribeDBInstanceMetricsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceMetricsResponseBodyItems setGroupKey(String groupKey) {
            this.groupKey = groupKey;
            return this;
        }
        public String getGroupKey() {
            return this.groupKey;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setSortRule(Integer sortRule) {
            this.sortRule = sortRule;
            return this;
        }
        public Integer getSortRule() {
            return this.sortRule;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setMetricsKey(String metricsKey) {
            this.metricsKey = metricsKey;
            return this;
        }
        public String getMetricsKey() {
            return this.metricsKey;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setGroupKeyType(String groupKeyType) {
            this.groupKeyType = groupKeyType;
            return this;
        }
        public String getGroupKeyType() {
            return this.groupKeyType;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setMetricsKeyAlias(String metricsKeyAlias) {
            this.metricsKeyAlias = metricsKeyAlias;
            return this;
        }
        public String getMetricsKeyAlias() {
            return this.metricsKeyAlias;
        }

    }

}
