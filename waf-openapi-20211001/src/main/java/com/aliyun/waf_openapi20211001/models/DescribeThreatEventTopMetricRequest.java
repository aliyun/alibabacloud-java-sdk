// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventTopMetricRequest extends TeaModel {
    /**
     * <p>The ID of the security event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0b7ab137a065aab7656986***11db</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The statistical metric. Different values of Metric correspond to different statistical objects. Valid values:</p>
     * <ul>
     * <li><strong>time</strong>: aggregates statistics by attack time, sorts them in descending order, and returns the top 5 records.</li>
     * <li><strong>src</strong>: aggregates statistics by source IP address of attack requests, sorts them in descending order, and returns the top 5 records.</li>
     * <li><strong>target</strong>: aggregates statistics by URL of attack requests (excluding query strings), sorts them in descending order, and returns the top 5 records.</li>
     * <li><strong>type</strong>: aggregates statistics by attack type, sorts them in descending order, and returns the top 5 records.</li>
     * <li><strong>tools</strong>: aggregates statistics by attack tool, sorts them in descending order, and returns the top 5 records.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>time</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
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

    public static DescribeThreatEventTopMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatEventTopMetricRequest self = new DescribeThreatEventTopMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeThreatEventTopMetricRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeThreatEventTopMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeThreatEventTopMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeThreatEventTopMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeThreatEventTopMetricRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
