// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTopNMetricShrinkRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. If you specify multiple filter conditions, all conditions must be met (logical AND).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

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

    public static DescribeNetworkFlowTopNMetricShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkFlowTopNMetricShrinkRequest self = new DescribeNetworkFlowTopNMetricShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkFlowTopNMetricShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public DescribeNetworkFlowTopNMetricShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkFlowTopNMetricShrinkRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeNetworkFlowTopNMetricShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeNetworkFlowTopNMetricShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkFlowTopNMetricShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
