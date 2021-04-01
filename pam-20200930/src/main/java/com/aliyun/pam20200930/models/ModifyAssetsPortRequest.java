// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class ModifyAssetsPortRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AssetProtocol")
    public String assetProtocol;

    @NameInMap("AssetPort")
    public Integer assetPort;

    @NameInMap("AssetUuids")
    public java.util.List<String> assetUuids;

    public static ModifyAssetsPortRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetsPortRequest self = new ModifyAssetsPortRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAssetsPortRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAssetsPortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAssetsPortRequest setAssetProtocol(String assetProtocol) {
        this.assetProtocol = assetProtocol;
        return this;
    }
    public String getAssetProtocol() {
        return this.assetProtocol;
    }

    public ModifyAssetsPortRequest setAssetPort(Integer assetPort) {
        this.assetPort = assetPort;
        return this;
    }
    public Integer getAssetPort() {
        return this.assetPort;
    }

    public ModifyAssetsPortRequest setAssetUuids(java.util.List<String> assetUuids) {
        this.assetUuids = assetUuids;
        return this;
    }
    public java.util.List<String> getAssetUuids() {
        return this.assetUuids;
    }

}
