// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AttachNetworkOptimizationSagsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("NetworkOptId")
    public String networkOptId;

    @NameInMap("SmartAGIds")
    public java.util.List<String> smartAGIds;

    public static AttachNetworkOptimizationSagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkOptimizationSagsRequest self = new AttachNetworkOptimizationSagsRequest();
        return TeaModel.build(map, self);
    }

    public AttachNetworkOptimizationSagsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AttachNetworkOptimizationSagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachNetworkOptimizationSagsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachNetworkOptimizationSagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AttachNetworkOptimizationSagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachNetworkOptimizationSagsRequest setNetworkOptId(String networkOptId) {
        this.networkOptId = networkOptId;
        return this;
    }
    public String getNetworkOptId() {
        return this.networkOptId;
    }

    public AttachNetworkOptimizationSagsRequest setSmartAGIds(java.util.List<String> smartAGIds) {
        this.smartAGIds = smartAGIds;
        return this;
    }
    public java.util.List<String> getSmartAGIds() {
        return this.smartAGIds;
    }

}
