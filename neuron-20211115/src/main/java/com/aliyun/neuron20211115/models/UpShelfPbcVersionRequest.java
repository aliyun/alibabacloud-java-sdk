// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpShelfPbcVersionRequest extends TeaModel {
    @NameInMap("marketId")
    public Long marketId;

    public static UpShelfPbcVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpShelfPbcVersionRequest self = new UpShelfPbcVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpShelfPbcVersionRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

}
