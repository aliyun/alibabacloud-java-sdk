// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAbnormalTypeRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster. </p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to obtain the hybrid cloud cluster information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>993</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end time of the query, in UNIX timestamp format (UTC). Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1726113600</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID of the WAF instance. </p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-g4***201</p>
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
     * <p>rg-ac***lani</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The start time of the query, in UNIX timestamp format (UTC). Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1723435200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The list of statuses for risk statistics.</p>
     * <blockquote>
     * <p>By default, risk data in the <strong>toBeConfirmed</strong>, <strong>toBeFixed</strong>, <strong>toBeVerified</strong>, and <strong>notFixed</strong> states is collected.</p>
     * </blockquote>
     */
    @NameInMap("UserStatusList")
    public java.util.List<String> userStatusList;

    public static DescribeUserAbnormalTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAbnormalTypeRequest self = new DescribeUserAbnormalTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserAbnormalTypeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeUserAbnormalTypeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeUserAbnormalTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserAbnormalTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserAbnormalTypeRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeUserAbnormalTypeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeUserAbnormalTypeRequest setUserStatusList(java.util.List<String> userStatusList) {
        this.userStatusList = userStatusList;
        return this;
    }
    public java.util.List<String> getUserStatusList() {
        return this.userStatusList;
    }

}
