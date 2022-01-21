// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromCbnRequest extends TeaModel {
    @NameInMap("CcnInstanceId")
    public String ccnInstanceId;

    @NameInMap("CenInstanceId")
    public String cenInstanceId;

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

    public static RevokeInstanceFromCbnRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromCbnRequest self = new RevokeInstanceFromCbnRequest();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromCbnRequest setCcnInstanceId(String ccnInstanceId) {
        this.ccnInstanceId = ccnInstanceId;
        return this;
    }
    public String getCcnInstanceId() {
        return this.ccnInstanceId;
    }

    public RevokeInstanceFromCbnRequest setCenInstanceId(String cenInstanceId) {
        this.cenInstanceId = cenInstanceId;
        return this;
    }
    public String getCenInstanceId() {
        return this.cenInstanceId;
    }

    public RevokeInstanceFromCbnRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RevokeInstanceFromCbnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RevokeInstanceFromCbnRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeInstanceFromCbnRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RevokeInstanceFromCbnRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
