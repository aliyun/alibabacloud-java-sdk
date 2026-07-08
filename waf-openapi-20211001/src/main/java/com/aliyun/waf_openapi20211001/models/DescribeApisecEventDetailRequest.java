// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventDetailRequest extends TeaModel {
    /**
     * <p>The ID of the Hybrid Cloud WAF cluster.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query information about hybrid cloud WAF clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the detailed information about the security event. Valid values:</p>
     * <ul>
     * <li><p><strong>event_info</strong> (default): attack details.</p>
     * </li>
     * <li><p><strong>api_info</strong>: API information.</p>
     * </li>
     * <li><p><strong>cnt_info</strong>: attack trend.</p>
     * </li>
     * <li><p><strong>ip_info</strong>: attacker IP information.</p>
     * </li>
     * <li><p><strong>sensitive_info</strong>: information about access to sensitive data.</p>
     * </li>
     * <li><p><strong>request_data</strong>: request information.</p>
     * </li>
     * <li><p><strong>response_data</strong>: response information.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event_info</p>
     */
    @NameInMap("DetailType")
    public String detailType;

    /**
     * <p>The ID of the API security event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18ba94fea9***e66ba0557b7b91</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The dimension of the security event. Valid values:</p>
     * <ul>
     * <li><p><strong>ip</strong> (default): IP security event.</p>
     * </li>
     * <li><p><strong>account</strong>: account security event.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EventScope")
    public String eventScope;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqtm005</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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

    public static DescribeApisecEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecEventDetailRequest self = new DescribeApisecEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecEventDetailRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecEventDetailRequest setDetailType(String detailType) {
        this.detailType = detailType;
        return this;
    }
    public String getDetailType() {
        return this.detailType;
    }

    public DescribeApisecEventDetailRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeApisecEventDetailRequest setEventScope(String eventScope) {
        this.eventScope = eventScope;
        return this;
    }
    public String getEventScope() {
        return this.eventScope;
    }

    public DescribeApisecEventDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecEventDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecEventDetailRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
