// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class PullTakeShoesEventRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("Date")
    public String date;

    @NameInMap("SkuId")
    public String skuId;

    public static PullTakeShoesEventRequest build(java.util.Map<String, ?> map) throws Exception {
        PullTakeShoesEventRequest self = new PullTakeShoesEventRequest();
        return TeaModel.build(map, self);
    }

    public PullTakeShoesEventRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public PullTakeShoesEventRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public PullTakeShoesEventRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
