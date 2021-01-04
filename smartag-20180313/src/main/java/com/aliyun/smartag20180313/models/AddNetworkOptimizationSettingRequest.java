// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddNetworkOptimizationSettingRequest extends TeaModel {
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

    public static AddNetworkOptimizationSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNetworkOptimizationSettingRequest self = new AddNetworkOptimizationSettingRequest();
        return TeaModel.build(map, self);
    }

    public AddNetworkOptimizationSettingRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddNetworkOptimizationSettingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddNetworkOptimizationSettingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddNetworkOptimizationSettingRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddNetworkOptimizationSettingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddNetworkOptimizationSettingRequest setNetworkOptId(String networkOptId) {
        this.networkOptId = networkOptId;
        return this;
    }
    public String getNetworkOptId() {
        return this.networkOptId;
    }

    public AddNetworkOptimizationSettingRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddNetworkOptimizationSettingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
