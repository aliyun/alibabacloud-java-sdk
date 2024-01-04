// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GenerateDownloadSecretKeyRequest extends TeaModel {
    @NameInMap("AppDecryptKey")
    public String appDecryptKey;

    @NameInMap("AppIdentification")
    public String appIdentification;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GenerateDownloadSecretKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDownloadSecretKeyRequest self = new GenerateDownloadSecretKeyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDownloadSecretKeyRequest setAppDecryptKey(String appDecryptKey) {
        this.appDecryptKey = appDecryptKey;
        return this;
    }
    public String getAppDecryptKey() {
        return this.appDecryptKey;
    }

    public GenerateDownloadSecretKeyRequest setAppIdentification(String appIdentification) {
        this.appIdentification = appIdentification;
        return this;
    }
    public String getAppIdentification() {
        return this.appIdentification;
    }

    public GenerateDownloadSecretKeyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GenerateDownloadSecretKeyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GenerateDownloadSecretKeyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
