// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetResellerPayOrderRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("Uid")
    public Long uid;

    public static GetResellerPayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResellerPayOrderRequest self = new GetResellerPayOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetResellerPayOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetResellerPayOrderRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
