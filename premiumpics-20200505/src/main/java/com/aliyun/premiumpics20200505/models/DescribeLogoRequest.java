// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeLogoRequest extends TeaModel {
    @NameInMap("GoodsId")
    public String goodsId;

    /**
     * <p>userId</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeLogoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogoRequest self = new DescribeLogoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogoRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public DescribeLogoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
