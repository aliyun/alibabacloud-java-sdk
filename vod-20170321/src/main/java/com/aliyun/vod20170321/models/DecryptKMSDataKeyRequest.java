// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DecryptKMSDataKeyRequest extends TeaModel {
    @NameInMap("CipherText")
    public String cipherText;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static DecryptKMSDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DecryptKMSDataKeyRequest self = new DecryptKMSDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public DecryptKMSDataKeyRequest setCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }
    public String getCipherText() {
        return this.cipherText;
    }

    public DecryptKMSDataKeyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DecryptKMSDataKeyRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DecryptKMSDataKeyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DecryptKMSDataKeyRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
