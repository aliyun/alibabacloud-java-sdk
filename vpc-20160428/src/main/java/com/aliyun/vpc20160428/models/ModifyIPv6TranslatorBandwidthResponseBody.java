// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorBandwidthResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>202304500950739</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF8198EE-8FC9-49C2-A22E-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIPv6TranslatorBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorBandwidthResponseBody self = new ModifyIPv6TranslatorBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorBandwidthResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyIPv6TranslatorBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
