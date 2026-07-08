// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserTrafficRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1665386280</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time interval. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public Long interval;

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
     * <p>rg-ae*******i</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1665331200</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The type of real-time user traffic. Valid values:</p>
     * <ul>
     * <li>bot: the number of bot management requests.</li>
     * <li>risk: the number of times risk identification is triggered.</li>
     * <li>custom_acl_captcha: the number of times the slider action of custom rules is triggered.</li>
     * <li>qps: the peak QPS.</li>
     * <li>apisec: the number of API security requests.</li>
     * <li>alb: the number of requests connected through ALB.</li>
     * <li>mse: the number of requests connected through MSE.</li>
     * <li>fc: the number of requests connected through Function Compute.</li>
     * <li>sae: the number of requests connected through Serverless App Engine.</li>
     * <li>apig: the number of requests connected through Cloud Native API Gateway.</li>
     * <li>nlb: the number of requests connected through NLB.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>qps</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeUserTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTrafficRequest self = new DescribeUserTrafficRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserTrafficRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeUserTrafficRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserTrafficRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeUserTrafficRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserTrafficRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeUserTrafficRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeUserTrafficRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
