// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTimeSeriesMetricShrinkRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. Multiple filter conditions have a logical AND relationship.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

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

    public static DescribeSecurityEventTimeSeriesMetricShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventTimeSeriesMetricShrinkRequest self = new DescribeSecurityEventTimeSeriesMetricShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventTimeSeriesMetricShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public DescribeSecurityEventTimeSeriesMetricShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSecurityEventTimeSeriesMetricShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeSecurityEventTimeSeriesMetricShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityEventTimeSeriesMetricShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
