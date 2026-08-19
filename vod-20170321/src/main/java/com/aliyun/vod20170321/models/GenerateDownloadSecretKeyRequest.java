// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GenerateDownloadSecretKeyRequest extends TeaModel {
    /**
     * <p>The custom encryption private key string. The string is 16 to 32 characters in length and consists of letters and digits. The string must contain uppercase letters, lowercase letters, and digits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppDecryptKeyAndroid20230101</p>
     */
    @NameInMap("AppDecryptKey")
    public String appDecryptKey;

    /**
     * <p>The unique identity of the app.</p>
     * <ul>
     * <li>Android: the SHA-1 value of the keystore file. The obtained SHA-1 value is a character string with colons.</li>
     * <li>iOS: the App Bundle ID value.</li>
     * <li>Windows: the serial number of the digital signing certificate.</li>
     * </ul>
     * <p>For information about how to obtain the unique identity of the app, see <a href="~~86107#section-wtj-9d7-lg2~~">Obtain the unique identity of the app</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BB:0D:AC:74:D3:21:09:EF:9C:71:1A:5E:77:2C:8E:BF:03:FD:FA:5A</p>
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
