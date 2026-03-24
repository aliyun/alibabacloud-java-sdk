// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTimeSeriesMetricRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. Multiple filter conditions are combined with a logical AND.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeNetworkFlowTimeSeriesMetricRequestFilter filter;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the type of data to return. Different values for Metric correspond to different data. This API operation supports the following values:</p>
     * <ul>
     * <li><p>qps: The number of requests that WAF processes per second. A queries per second (QPS) value is calculated every 10 seconds. The peak QPS value within the specified time granularity is returned.</p>
     * </li>
     * <li><p>total_requests: The total number of requests processed by WAF.</p>
     * </li>
     * <li><p>top5_status: The top five response status codes that WAF returns to the client, and the corresponding time series statistics.</p>
     * </li>
     * <li><p>top 5_upstream_status: The top five response status codes that the origin server returns to the client, and the corresponding time series statistics.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>total_requests</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
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
         * <p>The field to use for the filter operation. This API operation supports the following values for Key:</p>
         * <ul>
         * <li><p>matched_host</p>
         * </li>
         * <li><p>cluster</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>matched_host</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("OpValue")
        public String opValue;

        /**
         * <p>The filter value.</p>
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
         * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The query period cannot exceed the last 30 days. The start of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
         * <blockquote>
         * <h2>The start time must be within the last 30 days.</h2>
         * </blockquote>
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
         * <p>A list of filter conditions. Each item in the list describes a filter condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeNetworkFlowTimeSeriesMetricRequestFilterConditions> conditions;

        /**
         * <p>The time range to query.</p>
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
