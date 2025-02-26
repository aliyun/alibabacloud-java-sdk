// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateHybridCloudGroupRequest extends TeaModel {
    /**
     * <p>The region in which the node resides. Specify the parameter in the Carrier code-Continent code-City code format.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-asiapacific-beijing</p>
     */
    @NameInMap("BackSourceMark")
    public String backSourceMark;

    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterId")
    public Long clusterId;

    /**
     * <p>The name of the node group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoGroupName</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the node group. Valid values:</p>
     * <ul>
     * <li><strong>protect</strong></li>
     * <li><strong>control</strong></li>
     * <li><strong>storage</strong></li>
     * <li><strong>controlStorage</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>protect</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-n6w***x52m</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the server used for load balancing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3.3.3.3</p>
     */
    @NameInMap("LoadBalanceIp")
    public String loadBalanceIp;

    /**
     * <p>The region in which the node resides. Specify the parameter in the Carrier code-Continent code-City code format.</p>
     * 
     * <strong>example:</strong>
     * <p>0-410-0</p>
     */
    @NameInMap("LocationCode")
    public String locationCode;

    /**
     * <p>The region ID of the WAF instance. Valid values:</p>
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
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>demoRamark</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static CreateHybridCloudGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridCloudGroupRequest self = new CreateHybridCloudGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridCloudGroupRequest setBackSourceMark(String backSourceMark) {
        this.backSourceMark = backSourceMark;
        return this;
    }
    public String getBackSourceMark() {
        return this.backSourceMark;
    }

    public CreateHybridCloudGroupRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public CreateHybridCloudGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateHybridCloudGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateHybridCloudGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateHybridCloudGroupRequest setLoadBalanceIp(String loadBalanceIp) {
        this.loadBalanceIp = loadBalanceIp;
        return this;
    }
    public String getLoadBalanceIp() {
        return this.loadBalanceIp;
    }

    public CreateHybridCloudGroupRequest setLocationCode(String locationCode) {
        this.locationCode = locationCode;
        return this;
    }
    public String getLocationCode() {
        return this.locationCode;
    }

    public CreateHybridCloudGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHybridCloudGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateHybridCloudGroupRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
