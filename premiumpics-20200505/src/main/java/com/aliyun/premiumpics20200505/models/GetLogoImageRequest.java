// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetLogoImageRequest extends TeaModel {
    @NameInMap("GoodsId")
    public String goodsId;

    public static GetLogoImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogoImageRequest self = new GetLogoImageRequest();
        return TeaModel.build(map, self);
    }

    public GetLogoImageRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

}
