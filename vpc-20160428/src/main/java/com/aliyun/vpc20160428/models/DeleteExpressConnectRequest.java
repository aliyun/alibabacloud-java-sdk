// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DeleteExpressConnectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectRequest self = new DeleteExpressConnectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteExpressConnectRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public DeleteExpressConnectRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteExpressConnectRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteExpressConnectRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteExpressConnectRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteExpressConnectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteExpressConnectRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
