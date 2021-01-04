// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteNetworkOptimizationSettingRequest extends TeaModel {
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

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Type")
    public String type;

    public static DeleteNetworkOptimizationSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkOptimizationSettingRequest self = new DeleteNetworkOptimizationSettingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkOptimizationSettingRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteNetworkOptimizationSettingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteNetworkOptimizationSettingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteNetworkOptimizationSettingRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteNetworkOptimizationSettingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNetworkOptimizationSettingRequest setNetworkOptId(String networkOptId) {
        this.networkOptId = networkOptId;
        return this;
    }
    public String getNetworkOptId() {
        return this.networkOptId;
    }

    public DeleteNetworkOptimizationSettingRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteNetworkOptimizationSettingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
