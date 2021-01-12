// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    @NameInMap("ParameterGroupName")
    public String parameterGroupName;

    @NameInMap("ParameterGroupDesc")
    public String parameterGroupDesc;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterGroupRequest self = new ModifyParameterGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParameterGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyParameterGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyParameterGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyParameterGroupRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public ModifyParameterGroupRequest setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    public ModifyParameterGroupRequest setParameterGroupDesc(String parameterGroupDesc) {
        this.parameterGroupDesc = parameterGroupDesc;
        return this;
    }
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    public ModifyParameterGroupRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyParameterGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
