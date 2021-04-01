// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class RegisterAssetRequest extends TeaModel {
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

    public static RegisterAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAssetRequest self = new RegisterAssetRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAssetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RegisterAssetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RegisterAssetRequest setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
        return this;
    }
    public String getAssetUuid() {
        return this.assetUuid;
    }

    public RegisterAssetRequest setAssetThirdId(String assetThirdId) {
        this.assetThirdId = assetThirdId;
        return this;
    }
    public String getAssetThirdId() {
        return this.assetThirdId;
    }

    public RegisterAssetRequest setAssetRegionId(String assetRegionId) {
        this.assetRegionId = assetRegionId;
        return this;
    }
    public String getAssetRegionId() {
        return this.assetRegionId;
    }

    public RegisterAssetRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

}
