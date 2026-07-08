// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the Hybrid Cloud WAF cluster.</p>
     * <blockquote>
     * <p>This parameter is available only in hybrid cloud scenarios. Call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query Hybrid Cloud WAF clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1726113600</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-uax***b09</p>
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
     * <p>rg-aek2***uwbs5q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1668496310</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The type of detection statistics. Valid values:</p>
     * <ul>
     * <li><p><strong>risk</strong>: statistics on security risks.</p>
     * </li>
     * <li><p><strong>event</strong>: statistics on attacks.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>risk</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The list of statuses used to filter the detection statistics.</p>
     */
    @NameInMap("UserStatusList")
    public java.util.List<String> userStatusList;

    public static DescribeApisecStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecStatisticsRequest self = new DescribeApisecStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecStatisticsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecStatisticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeApisecStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecStatisticsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecStatisticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeApisecStatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeApisecStatisticsRequest setUserStatusList(java.util.List<String> userStatusList) {
        this.userStatusList = userStatusList;
        return this;
    }
    public java.util.List<String> getUserStatusList() {
        return this.userStatusList;
    }

}
