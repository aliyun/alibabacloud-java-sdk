// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GenerateDownloadSecretKeyRequest extends TeaModel {
    /**
     * <p>A custom string of 16 to 32 characters in length. The string must contain uppercase letters, lowercase letters, and digits.</p>
     */
    @NameInMap("AppDecryptKey")
    public String appDecryptKey;

    /**
     * <p>The unique identifier of the app.</p>
     * <br>
     * <p>*   Android: the SHA-1 fingerprint of the keystore. The value is a string that contains a colon (:).</p>
     * <p>*   iOS: the bundle ID of the app.</p>
     * <p>*   Windows: the serial number in the digital signature certificate.</p>
     * <br>
     * <p>For more information about how to obtain the unique identifier of an app, see [Obtain the unique app identifier](~~86107#section-wtj-9d7-lg2~~).</p>
     */
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
