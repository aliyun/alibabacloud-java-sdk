// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTmSbjProduceDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OrderId")
    public String orderId;

    public static QueryTmSbjProduceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTmSbjProduceDetailRequest self = new QueryTmSbjProduceDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTmSbjProduceDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryTmSbjProduceDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
