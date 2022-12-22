// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressBatchRequest extends TeaModel {
    @NameInMap("BindedInstanceId")
    public String bindedInstanceId;

    @NameInMap("BindedInstanceType")
    public String bindedInstanceType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AssociateEipAddressBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressBatchRequest self = new AssociateEipAddressBatchRequest();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressBatchRequest setBindedInstanceId(String bindedInstanceId) {
        this.bindedInstanceId = bindedInstanceId;
        return this;
    }
    public String getBindedInstanceId() {
        return this.bindedInstanceId;
    }

    public AssociateEipAddressBatchRequest setBindedInstanceType(String bindedInstanceType) {
        this.bindedInstanceType = bindedInstanceType;
        return this;
    }
    public String getBindedInstanceType() {
        return this.bindedInstanceType;
    }

    public AssociateEipAddressBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateEipAddressBatchRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AssociateEipAddressBatchRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AssociateEipAddressBatchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateEipAddressBatchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateEipAddressBatchRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateEipAddressBatchRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
