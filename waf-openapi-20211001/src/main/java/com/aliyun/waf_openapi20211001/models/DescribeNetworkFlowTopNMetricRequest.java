// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTopNMetricRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. If you specify multiple filter conditions, all conditions must be met (logical AND).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeNetworkFlowTopNMetricRequestFilter filter;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return. Results are sorted in descending order. Maximum value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The metric by which to query and rank data. Valid values:</p>
     * <ul>
     * <li><p>real_client_ip: Returns the top N source IP addresses of requests that are sent to WAF. The data is aggregated by source IP address and sorted in descending order.</p>
     * </li>
     * <li><p>http_user_agent: Returns the top N user agents of requests that are sent to WAF. The data is aggregated by user agent and sorted in descending order.</p>
     * </li>
     * <li><p>request_path: Returns the top N request URLs. The data is aggregated by URL and sorted in descending order.</p>
     * </li>
     * <li><p>matched_host_by_total_requests: Returns the top N protected objects by total number of requests received.</p>
     * </li>
     * <li><p>matched_host_by_qps: Returns the top N protected objects by queries per second (QPS).</p>
     * </li>
     * <li><p>matched_host_by_status: Returns the top N protected objects based on a specific WAF-returned HTTP status code. The data is aggregated by protected object and sorted in descending order. If you set Metric to this value, you must specify the status field in the Conditions parameter of Filter. The format is as follows:<br> {&quot;Key&quot;:&quot;status&quot;,&quot;OpValue&quot;:&quot;eq&quot;,&quot;Values&quot;:&quot;200&quot;}<br></p>
     * </li>
     * <li><p>matched_host_by_upstream_status: Returns the top N protected objects based on a specific origin server-returned HTTP status code. The data is aggregated by protected object and sorted in descending order. If you set Metric to this value, you must specify the upstream_status field in the Conditions parameter of Filter. The format is as follows:<br> {&quot;Key&quot;:&quot;upstream_status&quot;,&quot;OpValue&quot;:&quot;eq&quot;,&quot;Values&quot;:&quot;200&quot;}<br></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>matched_host_by_upstream_status</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The region in which the WAF instance resides. Valid values:</p>
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

    public static DescribeNetworkFlowTopNMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkFlowTopNMetricRequest self = new DescribeNetworkFlowTopNMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkFlowTopNMetricRequest setFilter(DescribeNetworkFlowTopNMetricRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public DescribeNetworkFlowTopNMetricRequestFilter getFilter() {
        return this.filter;
    }

    public DescribeNetworkFlowTopNMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkFlowTopNMetricRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeNetworkFlowTopNMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeNetworkFlowTopNMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkFlowTopNMetricRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static class DescribeNetworkFlowTopNMetricRequestFilterConditions extends TeaModel {
        /**
         * <p>The field name to use for filtering. Valid values:</p>
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
         * <p>The operator that is used for the filter condition. For more information about supported operators, see the <strong>Additional information about request parameters</strong> section.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("OpValue")
        public String opValue;

        /**
         * <p>The value to use for the filter condition. The value format depends on the Key and OpValue that you specify.</p>
         * 
         * <strong>example:</strong>
         * <p>test.waf-top</p>
         */
        @NameInMap("Values")
        public Object values;

        public static DescribeNetworkFlowTopNMetricRequestFilterConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTopNMetricRequestFilterConditions self = new DescribeNetworkFlowTopNMetricRequestFilterConditions();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTopNMetricRequestFilterConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkFlowTopNMetricRequestFilterConditions setOpValue(String opValue) {
            this.opValue = opValue;
            return this;
        }
        public String getOpValue() {
            return this.opValue;
        }

        public DescribeNetworkFlowTopNMetricRequestFilterConditions setValues(Object values) {
            this.values = values;
            return this;
        }
        public Object getValues() {
            return this.values;
        }

    }

    public static class DescribeNetworkFlowTopNMetricRequestFilterDateRange extends TeaModel {
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
         * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: seconds. The time range cannot exceed the last 30 days.</p>
         * <blockquote>
         * <p>The start time must be later than 30 days before the current time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        public static DescribeNetworkFlowTopNMetricRequestFilterDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTopNMetricRequestFilterDateRange self = new DescribeNetworkFlowTopNMetricRequestFilterDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTopNMetricRequestFilterDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeNetworkFlowTopNMetricRequestFilterDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeNetworkFlowTopNMetricRequestFilter extends TeaModel {
        /**
         * <p>The list of filter conditions.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeNetworkFlowTopNMetricRequestFilterConditions> conditions;

        /**
         * <p>The time range to query.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DateRange")
        public DescribeNetworkFlowTopNMetricRequestFilterDateRange dateRange;

        public static DescribeNetworkFlowTopNMetricRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTopNMetricRequestFilter self = new DescribeNetworkFlowTopNMetricRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTopNMetricRequestFilter setConditions(java.util.List<DescribeNetworkFlowTopNMetricRequestFilterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeNetworkFlowTopNMetricRequestFilterConditions> getConditions() {
            return this.conditions;
        }

        public DescribeNetworkFlowTopNMetricRequestFilter setDateRange(DescribeNetworkFlowTopNMetricRequestFilterDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeNetworkFlowTopNMetricRequestFilterDateRange getDateRange() {
            return this.dateRange;
        }

    }

}
