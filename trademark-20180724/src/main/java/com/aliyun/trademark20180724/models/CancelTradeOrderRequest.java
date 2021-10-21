// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CancelTradeOrderRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static CancelTradeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTradeOrderRequest self = new CancelTradeOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelTradeOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
