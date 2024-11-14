// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecAssetTrendRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>590</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range to query. Specify a UNIX timestamp in UTC. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683183599</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-ww**b06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
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
     * <p>rg-aek**7uq</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The beginning of the time range to query. Specify a UNIX timestamp in UTC. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1668496310</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeApisecAssetTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecAssetTrendRequest self = new DescribeApisecAssetTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecAssetTrendRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecAssetTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeApisecAssetTrendRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecAssetTrendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecAssetTrendRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecAssetTrendRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
