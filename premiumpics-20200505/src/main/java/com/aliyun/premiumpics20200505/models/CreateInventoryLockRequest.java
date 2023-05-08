// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CreateInventoryLockRequest extends TeaModel {
    @NameInMap("GoodsId")
    public String goodsId;

    /**
     * <p>UserId</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateInventoryLockRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInventoryLockRequest self = new CreateInventoryLockRequest();
        return TeaModel.build(map, self);
    }

    public CreateInventoryLockRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public CreateInventoryLockRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
