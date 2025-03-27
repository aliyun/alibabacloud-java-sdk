// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTimeSeriesMetricRequest extends TeaModel {
    /**
     * <p>The filter parameters for the query. Multiple parameters are evaluated by using a logical AND.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeSecurityEventTimeSeriesMetricRequestFilter filter;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-tl32ast****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metric whose time series data you want to return. The following metrics are supported:</p>
     * <ul>
     * <li>mitigated_requests: The system returns the time series data of requests that are blocked.</li>
     * <li>monitored_requests: The system returns the time series data of requests that match Monitor protection rules.</li>
     * <li>mitigated_requests_group_by_defense_scene: The system returns the number of requests that match each protection module. The returned results are grouped by protection module and can be used to generate time series charts. A request can match multiple protection modules. Therefore, the total number of matched requests is inconsistent with the total number of requests.</li>
     * <li>mitigated_requests_group_by_block_defense_scene: The system returns the number of requests that are blocked by each protection module. The returned results are grouped by protection module and can be used to generate time series charts. A request can be blocked by only one protection module. Therefore, the total number of blocked requests is consistent with the total number of requests.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mitigated_requests</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The region ID of the WAF instance. Valid values:</p>
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
         * <p>The field name. This operation supports all fields.</p>
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
         * <p>The field content.</p>
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
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The filter conditions. Multiple conditions are evaluated by using a logical AND.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeSecurityEventTimeSeriesMetricRequestFilterConditions> conditions;

        /**
         * <p>The time range for the query.</p>
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
