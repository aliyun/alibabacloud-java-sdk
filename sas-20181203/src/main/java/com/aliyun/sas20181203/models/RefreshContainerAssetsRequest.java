// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshContainerAssetsRequest extends TeaModel {
    /**
     * <p>The type of the container asset whose statistics you want to refresh. Valid values:</p>
     * <br>
     * <p>*   **IMAGE**</p>
     * <p>*   **CONTAINER**</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    public static RefreshContainerAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshContainerAssetsRequest self = new RefreshContainerAssetsRequest();
        return TeaModel.build(map, self);
    }

    public RefreshContainerAssetsRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

}
