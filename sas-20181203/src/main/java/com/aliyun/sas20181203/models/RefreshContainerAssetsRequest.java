// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshContainerAssetsRequest extends TeaModel {
    /**
     * <p>The Asset Type of the container asset to refresh. Valid values:</p>
     * <ul>
     * <li><strong>IMAGE</strong>: container image.</li>
     * <li><strong>CONTAINER</strong>: container.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
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
