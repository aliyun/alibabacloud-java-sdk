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
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metric that you want to use for statistics. Each metric corresponds to a different statistical object. Valid values:</p>
     * <ul>
     * <li><p><strong>time</strong>: Aggregates statistics by attack time and returns the top 5 entries in descending order.</p>
     * </li>
     * <li><p><strong>src</strong>: Aggregates statistics by the source IP address of attack requests and returns the top 5 entries in descending order.</p>
     * </li>
     * <li><p><strong>target</strong>: Aggregates statistics by the URL of attack requests, excluding the query string, and returns the top 5 entries in descending order.</p>
     * </li>
     * <li><p><strong>type</strong>: Aggregates statistics by attack type and returns the top 5 entries in descending order.</p>
     * </li>
     * <li><p><strong>tools</strong>: Aggregates statistics by attack tool and returns the top 5 entries in descending order.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>time</p>
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
