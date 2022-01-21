// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindSmartAccessGatewayRequest extends TeaModel {
    @NameInMap("CcnId")
    public String ccnId;

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

    @NameInMap("SmartAGUid")
    public Long smartAGUid;

    public static UnbindSmartAccessGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSmartAccessGatewayRequest self = new UnbindSmartAccessGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSmartAccessGatewayRequest setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public UnbindSmartAccessGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnbindSmartAccessGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindSmartAccessGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnbindSmartAccessGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnbindSmartAccessGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnbindSmartAccessGatewayRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public UnbindSmartAccessGatewayRequest setSmartAGUid(Long smartAGUid) {
        this.smartAGUid = smartAGUid;
        return this;
    }
    public Long getSmartAGUid() {
        return this.smartAGUid;
    }

}
