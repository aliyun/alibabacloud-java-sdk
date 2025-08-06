// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateMediaDNALibRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LibRegion")
    public String libRegion;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static CreateMediaDNALibRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaDNALibRequest self = new CreateMediaDNALibRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaDNALibRequest setLibRegion(String libRegion) {
        this.libRegion = libRegion;
        return this;
    }
    public String getLibRegion() {
        return this.libRegion;
    }

    public CreateMediaDNALibRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateMediaDNALibRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateMediaDNALibRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateMediaDNALibRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMediaDNALibRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
