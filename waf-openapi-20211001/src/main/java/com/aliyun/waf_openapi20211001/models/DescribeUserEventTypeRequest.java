// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserEventTypeRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. Call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain information about hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>976</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in UTC. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1726113600</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The dimension of the security event. Valid values:</p>
     * <ul>
     * <li><p><strong>ip</strong> (default): IP security events.</p>
     * </li>
     * <li><p><strong>account</strong>: account security events.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EventScope")
    public String eventScope;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-5y***h0t</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: regions outside the Chinese mainland.</p>
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
     * <p>rg-aek***ktt3y</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in UTC. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1723435200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>A list of security event statuses.</p>
     * <blockquote>
     * <p>By default, statistics are collected for security events in the <strong>toBeConfirmed</strong>, <strong>confirmed</strong>, and <strong>actioned</strong> states.</p>
     * </blockquote>
     */
    @NameInMap("UserStatusList")
    public java.util.List<String> userStatusList;

    public static DescribeUserEventTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEventTypeRequest self = new DescribeUserEventTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserEventTypeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeUserEventTypeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeUserEventTypeRequest setEventScope(String eventScope) {
        this.eventScope = eventScope;
        return this;
    }
    public String getEventScope() {
        return this.eventScope;
    }

    public DescribeUserEventTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserEventTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserEventTypeRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeUserEventTypeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeUserEventTypeRequest setUserStatusList(java.util.List<String> userStatusList) {
        this.userStatusList = userStatusList;
        return this;
    }
    public java.util.List<String> getUserStatusList() {
        return this.userStatusList;
    }

}
