// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListLocationRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    public static ListLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLocationRequest self = new ListLocationRequest();
        return TeaModel.build(map, self);
    }

    public ListLocationRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

}
