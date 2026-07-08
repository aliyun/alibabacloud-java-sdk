// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTimeSeriesMetricShrinkRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. Multiple filter conditions have a logical AND relationship.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metric to query. Different metrics return different data. Valid values:</p>
     * <ul>
     * <li><p>qps: The number of requests that WAF processes per second. This is a peak value. WAF calculates a queries per second (QPS) value every 10 seconds and uses the peak value within the specified time granularity as the QPS.</p>
     * </li>
     * <li><p>total_requests: The total number of requests that WAF processes.</p>
     * </li>
     * <li><p>top5_status: The top five response codes that WAF returns to the client and the corresponding time series statistics.</p>
     * </li>
     * <li><p>top5_upstream_status: The top five response codes that the origin server returns to the client and the corresponding time series statistics.</p>
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
     * <p>The region of the WAF instance. Valid values:</p>
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

    public static DescribeNetworkFlowTimeSeriesMetricShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkFlowTimeSeriesMetricShrinkRequest self = new DescribeNetworkFlowTimeSeriesMetricShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkFlowTimeSeriesMetricShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public DescribeNetworkFlowTimeSeriesMetricShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkFlowTimeSeriesMetricShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeNetworkFlowTimeSeriesMetricShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkFlowTimeSeriesMetricShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
