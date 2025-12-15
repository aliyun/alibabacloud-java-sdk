// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformToEcsResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20905403119****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DAABAD9B-890F-56C0-806C-6144946594AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransformToEcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformToEcsResponseBody self = new TransformToEcsResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformToEcsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransformToEcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
