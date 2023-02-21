// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMetricsResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>An array consisting of the enhanced monitoring metrics that are enabled for the instance.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceMetricsResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of enhanced monitoring metrics that are enabled for the instance.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBInstanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMetricsResponseBody self = new DescribeDBInstanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMetricsResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBInstanceMetricsResponseBody setItems(java.util.List<DescribeDBInstanceMetricsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBInstanceMetricsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBInstanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceMetricsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstanceMetricsResponseBodyItems extends TeaModel {
        /**
         * <p>The description of the enhanced monitoring metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The category of the enhanced monitoring metric. Valid values:</p>
         * <br>
         * <p>*   **os**: OS metric</p>
         * <p>*   **db**: database metric</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The key of the group to which the enhanced monitoring metric belongs.</p>
         */
        @NameInMap("GroupKey")
        public String groupKey;

        /**
         * <p>The name of the group to which the enhanced monitoring metric belongs.</p>
         */
        @NameInMap("GroupKeyType")
        public String groupKeyType;

        /**
         * <p>The method that is used to aggregate the monitoring data of the enhanced monitoring metric. Valid values:</p>
         * <br>
         * <p>*   **avg**: The system calculates the average value of the enhanced monitoring metric.</p>
         * <p>*   **min**: The system calculates the minimum value of the enhanced monitoring metric.</p>
         * <p>*   **max**: The system calculates the maximum value of the enhanced monitoring metric.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The key of the enhanced monitoring metric.</p>
         */
        @NameInMap("MetricsKey")
        public String metricsKey;

        /**
         * <p>The alias of the enhanced monitoring metric.</p>
         */
        @NameInMap("MetricsKeyAlias")
        public String metricsKeyAlias;

        /**
         * <p>The serial number of the enhanced monitoring metric.</p>
         */
        @NameInMap("SortRule")
        public Integer sortRule;

        /**
         * <p>The unit of the enhanced monitoring metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeDBInstanceMetricsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceMetricsResponseBodyItems self = new DescribeDBInstanceMetricsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceMetricsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setGroupKey(String groupKey) {
            this.groupKey = groupKey;
            return this;
        }
        public String getGroupKey() {
            return this.groupKey;
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

        public DescribeDBInstanceMetricsResponseBodyItems setMetricsKey(String metricsKey) {
            this.metricsKey = metricsKey;
            return this;
        }
        public String getMetricsKey() {
            return this.metricsKey;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setMetricsKeyAlias(String metricsKeyAlias) {
            this.metricsKeyAlias = metricsKeyAlias;
            return this;
        }
        public String getMetricsKeyAlias() {
            return this.metricsKeyAlias;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setSortRule(Integer sortRule) {
            this.sortRule = sortRule;
            return this;
        }
        public Integer getSortRule() {
            return this.sortRule;
        }

        public DescribeDBInstanceMetricsResponseBodyItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
