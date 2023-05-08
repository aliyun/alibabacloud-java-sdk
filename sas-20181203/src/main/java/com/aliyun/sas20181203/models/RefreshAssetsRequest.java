// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshAssetsRequest extends TeaModel {
    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("CloudAssetSubType")
    public Integer cloudAssetSubType;

    @NameInMap("CloudAssetType")
    public Integer cloudAssetType;

    public static RefreshAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAssetsRequest self = new RefreshAssetsRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAssetsRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public RefreshAssetsRequest setCloudAssetSubType(Integer cloudAssetSubType) {
        this.cloudAssetSubType = cloudAssetSubType;
        return this;
    }
    public Integer getCloudAssetSubType() {
        return this.cloudAssetSubType;
    }

    public RefreshAssetsRequest setCloudAssetType(Integer cloudAssetType) {
        this.cloudAssetType = cloudAssetType;
        return this;
    }
    public Integer getCloudAssetType() {
        return this.cloudAssetType;
    }

}
