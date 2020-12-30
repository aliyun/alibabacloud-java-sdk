// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorBandwidthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static ModifyIPv6TranslatorBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorBandwidthResponseBody self = new ModifyIPv6TranslatorBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyIPv6TranslatorBandwidthResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
