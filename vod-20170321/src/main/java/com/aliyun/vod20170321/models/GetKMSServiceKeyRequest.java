// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetKMSServiceKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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

    public static GetKMSServiceKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKMSServiceKeyRequest self = new GetKMSServiceKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetKMSServiceKeyRequest setKmsRegionId(String kmsRegionId) {
        this.kmsRegionId = kmsRegionId;
        return this;
    }
    public String getKmsRegionId() {
        return this.kmsRegionId;
    }

    public GetKMSServiceKeyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetKMSServiceKeyRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetKMSServiceKeyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetKMSServiceKeyRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
