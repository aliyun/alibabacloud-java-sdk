// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTopNMetricRequest extends TeaModel {
    /**
     * <p>An array of filter conditions. Multiple filter parameters use AND logic.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeNetworkFlowTopNMetricRequestFilter filter;

    /**
     * <p>The Web Application Firewall (WAF) instance ID.</p>
     * <blockquote>
     * <p> Call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to retrieve the WAF instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Returns up to 10 data entries, sorted in descending order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>Specifies the data type to be returned. Valid values:</p>
     * <ul>
     * <li>real_client_ip: The top N requests, sorted in descending order by source IP address, aggregated from all the current user\&quot;s WAF requests.</li>
     * <li>request_path: The top N requests, sorted in descending order by user-agent, aggregated from all the current user\&quot;s WAF requests.</li>
     * <li>request_path: The top N requests, sorted in descending order by request URL, aggregated from all the current user\&quot;s WAF requests.</li>
     * <li>matched_host_by_total_requests: The top N protected objects and their request counts for the current user.</li>
     * <li>matched_host_by_qps: The top N protected objects and their queries per second (QPS) values.</li>
     * <li>matched_host_by_status: When using it, you must specify status in the Conditions field of the Filter parameter. If the HTTP response code returned by WAF matches the status specified in the Conditions, then the top N data is returned, sorted in descending order by protected objects. The format for specifying the status is as follows:\
     * {&quot;Key&quot;:&quot;status&quot;,&quot;OpValue&quot;:&quot;eq&quot;,&quot;Values&quot;:&quot;200&quot;}</li>
     * <li>matched_host_by_upstream_status: When using it, you must specify upstream_status in the Conditions field of the Filter parameter. If the HTTP response code returned by the origin server matches the upstream_status specified, the top N data is returned, sorted in descending order by protected objects. The format for specifying the upstream_status is as follows:\
     * {&quot;Key&quot;:&quot;upstream_status&quot;,&quot;OpValue&quot;:&quot;eq&quot;,&quot;Values&quot;:&quot;200&quot;}</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>matched_host_by_upstream_status</p>
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
     * <p>The resource group ID.</p>
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
         * <p>The filter operator.
         * For details, see the <strong>Filter operators (OpValue)</strong> section below.</p>
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
         * <p>The list of filter conditions. Each node describes a filter condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeNetworkFlowTopNMetricRequestFilterConditions> conditions;

        /**
         * <p>Specifies the date range for the query.</p>
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
