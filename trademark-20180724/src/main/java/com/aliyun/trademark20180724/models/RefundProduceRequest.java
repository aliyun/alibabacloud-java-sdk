// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RefundProduceRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("RefundType")
    public String refundType;

    public static RefundProduceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundProduceRequest self = new RefundProduceRequest();
        return TeaModel.build(map, self);
    }

    public RefundProduceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefundProduceRequest setRefundType(String refundType) {
        this.refundType = refundType;
        return this;
    }
    public String getRefundType() {
        return this.refundType;
    }

}
