// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RoamClientUserRequest extends TeaModel {
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

    @NameInMap("OriginSmartAGId")
    public String originSmartAGId;

    @NameInMap("TargetSmartAGId")
    public String targetSmartAGId;

    @NameInMap("OriginRegionId")
    public String originRegionId;

    @NameInMap("UserName")
    public String userName;

    public static RoamClientUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RoamClientUserRequest self = new RoamClientUserRequest();
        return TeaModel.build(map, self);
    }

    public RoamClientUserRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RoamClientUserRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RoamClientUserRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RoamClientUserRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RoamClientUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RoamClientUserRequest setOriginSmartAGId(String originSmartAGId) {
        this.originSmartAGId = originSmartAGId;
        return this;
    }
    public String getOriginSmartAGId() {
        return this.originSmartAGId;
    }

    public RoamClientUserRequest setTargetSmartAGId(String targetSmartAGId) {
        this.targetSmartAGId = targetSmartAGId;
        return this;
    }
    public String getTargetSmartAGId() {
        return this.targetSmartAGId;
    }

    public RoamClientUserRequest setOriginRegionId(String originRegionId) {
        this.originRegionId = originRegionId;
        return this;
    }
    public String getOriginRegionId() {
        return this.originRegionId;
    }

    public RoamClientUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
