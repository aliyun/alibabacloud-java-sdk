// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GenerateDirectOperationTokenRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AssetUuid")
    public String assetUuid;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("CredentialName")
    public String credentialName;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("Password")
    public String password;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("PassPhrase")
    public String passPhrase;

    public static GenerateDirectOperationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDirectOperationTokenRequest self = new GenerateDirectOperationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDirectOperationTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateDirectOperationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateDirectOperationTokenRequest setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
        return this;
    }
    public String getAssetUuid() {
        return this.assetUuid;
    }

    public GenerateDirectOperationTokenRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public GenerateDirectOperationTokenRequest setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public GenerateDirectOperationTokenRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GenerateDirectOperationTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GenerateDirectOperationTokenRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public GenerateDirectOperationTokenRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

}
