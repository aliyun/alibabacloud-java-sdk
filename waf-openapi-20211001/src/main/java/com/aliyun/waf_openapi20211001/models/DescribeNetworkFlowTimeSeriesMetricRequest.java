// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTimeSeriesMetricRequest extends TeaModel {
    /**
     * <p>Specifies filtering conditions. Multiple filter parameters use AND logic.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeNetworkFlowTimeSeriesMetricRequestFilter filter;

    /**
     * <p>The Web Application Firewall (WAF) instance ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to retrieve the WAF instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the data type to be returned. Valid values:</p>
     * <ul>
     * <li>qps: Returns the queries per second (QPS) processed by WAF. This value is calculated using a peak detection method: QPS is measured every 10 seconds, and the highest value within the specified time range is returned.</li>
     * <li>total_requests: Returns the total number of requests processed by WAF.</li>
     * <li>top5_status: Returns the top 5 HTTP status codes returned by the WAF to clients, along with their corresponding time series statistics.</li>
     * <li>top 5_upstream_status: Returns the top 5 HTTP status codes returned by the origin server to clients, along with their corresponding time series data.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>total_requests</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The region ID of WAF instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: The Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: Outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeNetworkFlowTimeSeriesMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkFlowTimeSeriesMetricRequest self = new DescribeNetworkFlowTimeSeriesMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkFlowTimeSeriesMetricRequest setFilter(DescribeNetworkFlowTimeSeriesMetricRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public DescribeNetworkFlowTimeSeriesMetricRequestFilter getFilter() {
        return this.filter;
    }

    public DescribeNetworkFlowTimeSeriesMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkFlowTimeSeriesMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeNetworkFlowTimeSeriesMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkFlowTimeSeriesMetricRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static class DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions extends TeaModel {
        /**
         * <p>The filter fields. Valid values:</p>
         * <ul>
         * <li>matched_host</li>
         * <li>cluster</li>
         * </ul>
         * <p>For details, see the <strong>Filter fields (Key)</strong> section below.</p>
         * 
         * <strong>example:</strong>
         * <p>matched_host</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter operator. For details, see the <strong>Filter operators (OpValue)</strong> section below.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("OpValue")
        public String opValue;

        /**
         * <p>The filter content.</p>
         * 
         * <strong>example:</strong>
         * <p>test.waf-top</p>
         */
        @NameInMap("Values")
        public Object values;

        public static DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions self = new DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions setOpValue(String opValue) {
            this.opValue = opValue;
            return this;
        }
        public String getOpValue() {
            return this.opValue;
        }

        public DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions setValues(Object values) {
            this.values = values;
            return this;
        }
        public Object getValues() {
            return this.values;
        }

    }

    public static class DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange extends TeaModel {
        /**
         * <p>End time of the query range (Unix timestamp, seconds).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>Start time of the query range (Unix timestamp, seconds).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        public static DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange self = new DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeNetworkFlowTimeSeriesMetricRequestFilter extends TeaModel {
        /**
         * <p>The list of filter conditions. Each node describes a filter condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions> conditions;

        /**
         * <p>Specifies the date range for the query.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DateRange")
        public DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange dateRange;

        public static DescribeNetworkFlowTimeSeriesMetricRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTimeSeriesMetricRequestFilter self = new DescribeNetworkFlowTimeSeriesMetricRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTimeSeriesMetricRequestFilter setConditions(java.util.List<DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions> getConditions() {
            return this.conditions;
        }

        public DescribeNetworkFlowTimeSeriesMetricRequestFilter setDateRange(DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeNetworkFlowTimeSeriesMetricRequestFilterDateRange getDateRange() {
            return this.dateRange;
        }

    }

}
