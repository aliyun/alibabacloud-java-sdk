// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateAssetWatchCmd extends TeaModel {
    @NameInMap("assetId")
    public Long assetId;

    @NameInMap("assetType")
    public String assetType;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("marketId")
    public Long marketId;

    public static CreateAssetWatchCmd build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetWatchCmd self = new CreateAssetWatchCmd();
        return TeaModel.build(map, self);
    }

    public CreateAssetWatchCmd setAssetId(Long assetId) {
        this.assetId = assetId;
        return this;
    }
    public Long getAssetId() {
        return this.assetId;
    }

    public CreateAssetWatchCmd setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public CreateAssetWatchCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CreateAssetWatchCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

}
