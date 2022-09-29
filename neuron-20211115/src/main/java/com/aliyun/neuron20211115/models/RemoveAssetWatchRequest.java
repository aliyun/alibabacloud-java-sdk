// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RemoveAssetWatchRequest extends TeaModel {
    @NameInMap("asset_type")
    public String assetType;

    public static RemoveAssetWatchRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAssetWatchRequest self = new RemoveAssetWatchRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAssetWatchRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

}
