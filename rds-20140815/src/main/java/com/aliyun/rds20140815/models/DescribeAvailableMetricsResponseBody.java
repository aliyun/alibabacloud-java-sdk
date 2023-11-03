// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableMetricsResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Details of the Enhanced Monitoring metric.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAvailableMetricsResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of enhanced monitoring metrics that are available for the instance.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAvailableMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMetricsResponseBody self = new DescribeAvailableMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMetricsResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
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
        /**
         * <p>The description of the Enhanced Monitoring metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The category of the Enhanced Monitoring metric. Valid values:</p>
         * <br>
         * <p>*   **os**: OS metric</p>
         * <p>*   **db**: database metric</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The key of the group to which the Enhanced Monitoring metric belongs.</p>
         */
        @NameInMap("GroupKey")
        public String groupKey;

        /**
         * <p>The name of the group to which the Enhanced Monitoring metric belongs.</p>
         */
        @NameInMap("GroupKeyType")
        public String groupKeyType;

        /**
         * <p>The method that is used to aggregate the monitoring data of the Enhanced Monitoring metric. Valid values:</p>
         * <br>
         * <p>*   **avg**: The system calculates the average value of the Enhanced Monitoring metric.</p>
         * <p>*   **min**: The system calculates the minimum value of the Enhanced Monitoring metric.</p>
         * <p>*   **max**: The system calculates the maximum value of the Enhanced Monitoring metric.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The key of the Enhanced Monitoring metric.</p>
         */
        @NameInMap("MetricsKey")
        public String metricsKey;

        /**
         * <p>The alias of the Enhanced Monitoring metric.</p>
         */
        @NameInMap("MetricsKeyAlias")
        public String metricsKeyAlias;

        /**
         * <p>The serial number of the Enhanced Monitoring metric.</p>
         */
        @NameInMap("SortRule")
        public Integer sortRule;

        /**
         * <p>The unit of the Enhanced Monitoring metric.</p>
         */
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
