// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTimeSeriesMetricRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. Multiple filter conditions have a logical AND relationship.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeSecurityEventTimeSeriesMetricRequestFilter filter;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-tl32ast****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the content of the returned data. Different metrics correspond to different data content. This operation supports the following metrics:</p>
     * <ul>
     * <li><p>mitigated_requests: Returns the time series statistics of blocked requests.</p>
     * </li>
     * <li><p>monitored_requests: Returns the time series statistics of requests that hit only observation-type rules.</p>
     * </li>
     * <li><p>mitigated_requests_group_by_defense_scene: Returns data grouped by module. It records a time series graph of the hit count for each module. A single request may hit multiple modules. Therefore, the hit count returned by this metric may not be consistent with the number of requests.</p>
     * </li>
     * <li><p>mitigated_requests_group_by_block_defense_scene: Returns data grouped by module. It records a time series graph of the number of blocked requests for each module. A single request is blocked by only one module. Therefore, the count returned by this metric is consistent with the number of requests.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mitigated_requests</p>
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

    public static DescribeSecurityEventTimeSeriesMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventTimeSeriesMetricRequest self = new DescribeSecurityEventTimeSeriesMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventTimeSeriesMetricRequest setFilter(DescribeSecurityEventTimeSeriesMetricRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public DescribeSecurityEventTimeSeriesMetricRequestFilter getFilter() {
        return this.filter;
    }

    public DescribeSecurityEventTimeSeriesMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSecurityEventTimeSeriesMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeSecurityEventTimeSeriesMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityEventTimeSeriesMetricRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static class DescribeSecurityEventTimeSeriesMetricRequestFilterConditions extends TeaModel {
        /**
         * <p>The name of the field to filter. This operation supports all fields.</p>
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

        public static DescribeSecurityEventTimeSeriesMetricRequestFilterConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTimeSeriesMetricRequestFilterConditions self = new DescribeSecurityEventTimeSeriesMetricRequestFilterConditions();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTimeSeriesMetricRequestFilterConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSecurityEventTimeSeriesMetricRequestFilterConditions setOpValue(String opValue) {
            this.opValue = opValue;
            return this;
        }
        public String getOpValue() {
            return this.opValue;
        }

        public DescribeSecurityEventTimeSeriesMetricRequestFilterConditions setValues(Object values) {
            this.values = values;
            return this;
        }
        public Object getValues() {
            return this.values;
        }

    }

    public static class DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange extends TeaModel {
        /**
         * <p>The end time of the query. This is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>You can query data from the last 30 days. The start time of the query. This is a UNIX timestamp. Unit: seconds.</p>
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

        public static DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange self = new DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeSecurityEventTimeSeriesMetricRequestFilter extends TeaModel {
        /**
         * <p>A list of filter conditions. Each node describes one filter condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeSecurityEventTimeSeriesMetricRequestFilterConditions> conditions;

        /**
         * <p>The time range to query.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DateRange")
        public DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange dateRange;

        public static DescribeSecurityEventTimeSeriesMetricRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTimeSeriesMetricRequestFilter self = new DescribeSecurityEventTimeSeriesMetricRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTimeSeriesMetricRequestFilter setConditions(java.util.List<DescribeSecurityEventTimeSeriesMetricRequestFilterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeSecurityEventTimeSeriesMetricRequestFilterConditions> getConditions() {
            return this.conditions;
        }

        public DescribeSecurityEventTimeSeriesMetricRequestFilter setDateRange(DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeSecurityEventTimeSeriesMetricRequestFilterDateRange getDateRange() {
            return this.dateRange;
        }

    }

}
