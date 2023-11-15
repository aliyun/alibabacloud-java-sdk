// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryProduceDetailRequest extends TeaModel {
    @NameInMap("ApplyNo")
    public String applyNo;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OrderId")
    public String orderId;

    public static QueryProduceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProduceDetailRequest self = new QueryProduceDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryProduceDetailRequest setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public QueryProduceDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryProduceDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
