// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateKMSServiceKeyRequest extends TeaModel {
    @NameInMap("KmsRegionId")
    public String kmsRegionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static CreateKMSServiceKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKMSServiceKeyRequest self = new CreateKMSServiceKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateKMSServiceKeyRequest setKmsRegionId(String kmsRegionId) {
        this.kmsRegionId = kmsRegionId;
        return this;
    }
    public String getKmsRegionId() {
        return this.kmsRegionId;
    }

    public CreateKMSServiceKeyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateKMSServiceKeyRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateKMSServiceKeyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateKMSServiceKeyRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
