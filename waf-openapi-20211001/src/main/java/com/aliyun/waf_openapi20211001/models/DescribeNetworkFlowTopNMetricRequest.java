// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTopNMetricRequest extends TeaModel {
    /**
     * <p>The query filter conditions. Multiple filter conditions are connected by the logical AND operator.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeNetworkFlowTopNMetricRequestFilter filter;

    /**
     * <p>The WAF instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of data entries to return after the statistics are sorted in descending order. Maximum value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The metric used to distinguish the returned data content. Different metrics correspond to different data content. The metrics supported by this operation are as follows:</p>
     * <ul>
     * <li>real_client_ip: aggregates and sorts all requests of the current user that pass through WAF by the source IP address of the request in descending order, and returns the top N data entries.</li>
     * <li>http_user_agent: aggregates and sorts all requests of the current user that pass through WAF by the User-Agent of the request in descending order, and returns the top N data entries.</li>
     * <li>request_path: aggregates and sorts all requests of the current user that pass through WAF by the URL of the request in descending order, and returns the top N data entries.</li>
     * <li>matched_host_by_total_requests: returns the top N protected objects with the largest number of requests for the current user and the corresponding number of requests.</li>
     * <li>matched_host_by_qps: returns the top N protected objects with the highest QPS for the current user and the corresponding QPS data.</li>
     * <li>matched_host_by_status: when this metric is used, you must specify status in the Conditions field of Filter. WAF aggregates and sorts the data whose HTTP response code returned by WAF is equal to the status specified in Conditions by protected object, and returns the top N data entries. The format for specifying status is as follows:<br>
     * {&quot;Key&quot;:&quot;status&quot;,&quot;OpValue&quot;:&quot;eq&quot;,&quot;Values&quot;:&quot;200&quot;}</li>
     * <li>matched_host_by_upstream_status: when this metric is used, you must specify upstream_status in the Conditions field of Filter. WAF aggregates and sorts the data whose HTTP response code returned by the origin server is equal to the upstream_status specified in Conditions by protected object, and returns the top N data entries. The format for specifying upstream_status is as follows:<br>
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
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
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
         * <p>The name of the field on which the filter operation is performed. The Key parameter of the current operation supports only the following two fields:</p>
         * <ul>
         * <li>matched_host</li>
         * <li>cluster</li>
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
         * <p>The filter values.</p>
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
         * <p>The end time of the query. The end time is represented by a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The start time of the query. The data query range cannot exceed the past 30 days. The start time is represented by a UNIX timestamp in seconds.</p>
         * <blockquote>
         * <p>The start time must be later than the current time minus 30 days.</p>
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
         * <p>The list of filter conditions. Each node describes a filter condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeNetworkFlowTopNMetricRequestFilterConditions> conditions;

        /**
         * <p>The query time range.</p>
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
