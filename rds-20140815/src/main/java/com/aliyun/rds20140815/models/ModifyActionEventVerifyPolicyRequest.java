// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventVerifyPolicyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserPublicKey")
    public String userPublicKey;

    public static ModifyActionEventVerifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventVerifyPolicyRequest self = new ModifyActionEventVerifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActionEventVerifyPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyActionEventVerifyPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyActionEventVerifyPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyActionEventVerifyPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyActionEventVerifyPolicyRequest setUserPublicKey(String userPublicKey) {
        this.userPublicKey = userPublicKey;
        return this;
    }
    public String getUserPublicKey() {
        return this.userPublicKey;
    }

}
