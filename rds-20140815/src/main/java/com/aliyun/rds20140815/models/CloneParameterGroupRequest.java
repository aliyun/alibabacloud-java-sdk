// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneParameterGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the parameter template in the destination region.</p>
     * 
     * <strong>example:</strong>
     * <p>CloneGroup1</p>
     */
    @NameInMap("ParameterGroupDesc")
    public String parameterGroupDesc;

    /**
     * <p>The ID of the parameter template. You can call the DescribeParameterGroups operation to query the parameter template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rpg-13ppdh****</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The name of the parameter template in the destination region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tartestgroup</p>
     */
    @NameInMap("ParameterGroupName")
    public String parameterGroupName;

    /**
     * <p>The ID of the source region to which the parameter template belongs. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the destination region. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("TargetRegionId")
    public String targetRegionId;

    public static CloneParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneParameterGroupRequest self = new CloneParameterGroupRequest();
        return TeaModel.build(map, self);
    }

    public CloneParameterGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloneParameterGroupRequest setParameterGroupDesc(String parameterGroupDesc) {
        this.parameterGroupDesc = parameterGroupDesc;
        return this;
    }
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    public CloneParameterGroupRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public CloneParameterGroupRequest setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    public CloneParameterGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CloneParameterGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CloneParameterGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloneParameterGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloneParameterGroupRequest setTargetRegionId(String targetRegionId) {
        this.targetRegionId = targetRegionId;
        return this;
    }
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

}
