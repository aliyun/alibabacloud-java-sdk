// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteShardingNodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the order. On the Orders page in the Billing Management console, you can obtain the details of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteShardingNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteShardingNodeResponseBody self = new DeleteShardingNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteShardingNodeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DeleteShardingNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
