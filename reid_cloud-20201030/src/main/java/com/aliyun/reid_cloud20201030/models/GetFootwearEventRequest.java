// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class GetFootwearEventRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("Date")
    public String date;

    public static GetFootwearEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFootwearEventRequest self = new GetFootwearEventRequest();
        return TeaModel.build(map, self);
    }

    public GetFootwearEventRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public GetFootwearEventRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
