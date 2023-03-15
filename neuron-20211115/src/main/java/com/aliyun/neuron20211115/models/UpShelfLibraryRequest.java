// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpShelfLibraryRequest extends TeaModel {
    @NameInMap("marketId")
    public Long marketId;

    public static UpShelfLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpShelfLibraryRequest self = new UpShelfLibraryRequest();
        return TeaModel.build(map, self);
    }

    public UpShelfLibraryRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

}
