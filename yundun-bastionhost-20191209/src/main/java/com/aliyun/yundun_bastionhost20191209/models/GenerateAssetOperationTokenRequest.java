// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GenerateAssetOperationTokenRequest extends TeaModel {
    @NameInMap("AssetAccountId")
    public String assetAccountId;

    @NameInMap("AssetAccountName")
    public String assetAccountName;

    @NameInMap("AssetAccountPassword")
    public String assetAccountPassword;

    @NameInMap("AssetAccountProtocolName")
    public String assetAccountProtocolName;

    @NameInMap("AssetId")
    public String assetId;

    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static GenerateAssetOperationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAssetOperationTokenRequest self = new GenerateAssetOperationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAssetOperationTokenRequest setAssetAccountId(String assetAccountId) {
        this.assetAccountId = assetAccountId;
        return this;
    }
    public String getAssetAccountId() {
        return this.assetAccountId;
    }

    public GenerateAssetOperationTokenRequest setAssetAccountName(String assetAccountName) {
        this.assetAccountName = assetAccountName;
        return this;
    }
    public String getAssetAccountName() {
        return this.assetAccountName;
    }

    public GenerateAssetOperationTokenRequest setAssetAccountPassword(String assetAccountPassword) {
        this.assetAccountPassword = assetAccountPassword;
        return this;
    }
    public String getAssetAccountPassword() {
        return this.assetAccountPassword;
    }

    public GenerateAssetOperationTokenRequest setAssetAccountProtocolName(String assetAccountProtocolName) {
        this.assetAccountProtocolName = assetAccountProtocolName;
        return this;
    }
    public String getAssetAccountProtocolName() {
        return this.assetAccountProtocolName;
    }

    public GenerateAssetOperationTokenRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public GenerateAssetOperationTokenRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public GenerateAssetOperationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateAssetOperationTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
