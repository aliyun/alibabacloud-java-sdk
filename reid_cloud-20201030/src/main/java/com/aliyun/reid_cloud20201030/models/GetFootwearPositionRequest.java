// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class GetFootwearPositionRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("Date")
    public String date;

    @NameInMap("SkuId")
    public String skuId;

    public static GetFootwearPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFootwearPositionRequest self = new GetFootwearPositionRequest();
        return TeaModel.build(map, self);
    }

    public GetFootwearPositionRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public GetFootwearPositionRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetFootwearPositionRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
