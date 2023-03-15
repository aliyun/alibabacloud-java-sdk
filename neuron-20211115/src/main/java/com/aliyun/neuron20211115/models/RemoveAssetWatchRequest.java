// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RemoveAssetWatchRequest extends TeaModel {
    @NameInMap("assetType")
    public String assetType;

    @NameInMap("companyId")
    public Long companyId;

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

    public RemoveAssetWatchRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

}
