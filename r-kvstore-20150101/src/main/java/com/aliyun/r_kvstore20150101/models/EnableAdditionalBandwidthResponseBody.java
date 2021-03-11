// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class EnableAdditionalBandwidthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static EnableAdditionalBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAdditionalBandwidthResponseBody self = new EnableAdditionalBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAdditionalBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableAdditionalBandwidthResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
