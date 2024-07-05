// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class OpenVsServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>150275784</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenVsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenVsServiceResponseBody self = new OpenVsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenVsServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenVsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
