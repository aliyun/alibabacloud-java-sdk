// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudGroupShrinkServerRequest extends TeaModel {
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
     * <p>The ID of the node group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldb****05</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b1bf3f544f30c1de0b72d91290***bbbb</p>
     */
    @NameInMap("Mids")
    public String mids;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: Outside the Chinese mainland.</li>
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
     * <p>rg-acfm2th****v6ay</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static ModifyHybridCloudGroupShrinkServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudGroupShrinkServerRequest self = new ModifyHybridCloudGroupShrinkServerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudGroupShrinkServerRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public ModifyHybridCloudGroupShrinkServerRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ModifyHybridCloudGroupShrinkServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHybridCloudGroupShrinkServerRequest setMids(String mids) {
        this.mids = mids;
        return this;
    }
    public String getMids() {
        return this.mids;
    }

    public ModifyHybridCloudGroupShrinkServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHybridCloudGroupShrinkServerRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
