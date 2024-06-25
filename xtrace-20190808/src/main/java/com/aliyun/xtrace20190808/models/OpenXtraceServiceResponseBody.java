// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class OpenXtraceServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>155709986</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1FC4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static OpenXtraceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenXtraceServiceResponseBody self = new OpenXtraceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenXtraceServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenXtraceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenXtraceServiceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
