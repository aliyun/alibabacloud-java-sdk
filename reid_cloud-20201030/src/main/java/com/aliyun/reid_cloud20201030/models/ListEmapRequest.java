// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListEmapRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    public static ListEmapRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEmapRequest self = new ListEmapRequest();
        return TeaModel.build(map, self);
    }

    public ListEmapRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

}
