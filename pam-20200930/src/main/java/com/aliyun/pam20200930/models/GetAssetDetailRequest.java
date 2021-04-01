// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GetAssetDetailRequest extends TeaModel {
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

    public static GetAssetDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetDetailRequest self = new GetAssetDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAssetDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAssetDetailRequest setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
        return this;
    }
    public String getAssetUuid() {
        return this.assetUuid;
    }

    public GetAssetDetailRequest setAssetThirdId(String assetThirdId) {
        this.assetThirdId = assetThirdId;
        return this;
    }
    public String getAssetThirdId() {
        return this.assetThirdId;
    }

    public GetAssetDetailRequest setAssetRegionId(String assetRegionId) {
        this.assetRegionId = assetRegionId;
        return this;
    }
    public String getAssetRegionId() {
        return this.assetRegionId;
    }

    public GetAssetDetailRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

}
