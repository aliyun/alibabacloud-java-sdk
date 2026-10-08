// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableMetricsResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The list of enhanced monitoring metrics.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAvailableMetricsResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CD61041-35F7-10F7-BE94-33A48B221218</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of enhanced monitoring metrics supported by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
         * <p>The description of the enhanced monitoring metric.</p>
         * 
         * <strong>example:</strong>
         * <p>sys cpu usage, sys cpu usage / total cpu</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The category of the enhanced monitoring metric. Valid values:</p>
         * <ul>
         * <li><strong>os</strong>: operating system metric.</li>
         * <li><strong>db</strong>: database metric.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>os</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The key of the group to which the enhanced monitoring metric belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>os.cpu_usage</p>
         */
        @NameInMap("GroupKey")
        public String groupKey;

        /**
         * <p>The name of the group to which the enhanced monitoring metric belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU Usage</p>
         */
        @NameInMap("GroupKeyType")
        public String groupKeyType;

        /**
         * <p>The statistical method of the enhanced monitoring metric. Valid values:</p>
         * <ul>
         * <li><strong>avg</strong>: average value.</li>
         * <li><strong>min</strong>: minimum value.</li>
         * <li><strong>max</strong>: maximum value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>avg</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The key of the enhanced monitoring metric.</p>
         * 
         * <strong>example:</strong>
         * <p>os.cpu_usage.sys.avg</p>
         */
        @NameInMap("MetricsKey")
        public String metricsKey;

        /**
         * <p>The alias of the enhanced monitoring metric.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_sys_per_core</p>
         */
        @NameInMap("MetricsKeyAlias")
        public String metricsKeyAlias;

        /**
         * <p>The sequence number of the enhanced monitoring metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SortRule")
        public Integer sortRule;

        /**
         * <p>The unit of the enhanced monitoring metric.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
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
