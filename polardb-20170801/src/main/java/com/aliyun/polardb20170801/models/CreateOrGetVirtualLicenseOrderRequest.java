// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateOrGetVirtualLicenseOrderRequest extends TeaModel {
    /**
     * <p>The type of the engine. Valid values: PG, Oracle, and MySQL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PG</p>
     */
    @NameInMap("Engine")
    public String engine;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateOrGetVirtualLicenseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrGetVirtualLicenseOrderRequest self = new CreateOrGetVirtualLicenseOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrGetVirtualLicenseOrderRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateOrGetVirtualLicenseOrderRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateOrGetVirtualLicenseOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateOrGetVirtualLicenseOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateOrGetVirtualLicenseOrderRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
