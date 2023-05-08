// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetProduceInfoRequest extends TeaModel {
    @NameInMap("GoodsId")
    public String goodsId;

    public static GetProduceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProduceInfoRequest self = new GetProduceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetProduceInfoRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

}
