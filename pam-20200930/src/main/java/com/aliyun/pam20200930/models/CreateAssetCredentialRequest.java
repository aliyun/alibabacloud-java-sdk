// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class CreateAssetCredentialRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AssetUuid")
    public String assetUuid;

    @NameInMap("AssetThirdId")
    public String assetThirdId;

    @NameInMap("AssetRegionId")
    public String assetRegionId;

    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("CredentialType")
    public String credentialType;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("Password")
    public String password;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("PassPhrase")
    public String passPhrase;

    @NameInMap("Description")
    public String description;

    public static CreateAssetCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetCredentialRequest self = new CreateAssetCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateAssetCredentialRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAssetCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAssetCredentialRequest setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
        return this;
    }
    public String getAssetUuid() {
        return this.assetUuid;
    }

    public CreateAssetCredentialRequest setAssetThirdId(String assetThirdId) {
        this.assetThirdId = assetThirdId;
        return this;
    }
    public String getAssetThirdId() {
        return this.assetThirdId;
    }

    public CreateAssetCredentialRequest setAssetRegionId(String assetRegionId) {
        this.assetRegionId = assetRegionId;
        return this;
    }
    public String getAssetRegionId() {
        return this.assetRegionId;
    }

    public CreateAssetCredentialRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public CreateAssetCredentialRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public CreateAssetCredentialRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAssetCredentialRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateAssetCredentialRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CreateAssetCredentialRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

    public CreateAssetCredentialRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
