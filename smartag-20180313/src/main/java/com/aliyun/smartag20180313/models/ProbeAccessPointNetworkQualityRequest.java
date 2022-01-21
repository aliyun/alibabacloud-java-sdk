// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ProbeAccessPointNetworkQualityRequest extends TeaModel {
    @NameInMap("AccessPointIds")
    public java.util.List<Integer> accessPointIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    public static ProbeAccessPointNetworkQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        ProbeAccessPointNetworkQualityRequest self = new ProbeAccessPointNetworkQualityRequest();
        return TeaModel.build(map, self);
    }

    public ProbeAccessPointNetworkQualityRequest setAccessPointIds(java.util.List<Integer> accessPointIds) {
        this.accessPointIds = accessPointIds;
        return this;
    }
    public java.util.List<Integer> getAccessPointIds() {
        return this.accessPointIds;
    }

    public ProbeAccessPointNetworkQualityRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ProbeAccessPointNetworkQualityRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ProbeAccessPointNetworkQualityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ProbeAccessPointNetworkQualityRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ProbeAccessPointNetworkQualityRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ProbeAccessPointNetworkQualityRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
