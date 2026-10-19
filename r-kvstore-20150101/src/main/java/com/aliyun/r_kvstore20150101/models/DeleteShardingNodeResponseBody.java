// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteShardingNodeResponseBody extends TeaModel {
    /**
     * <p>The order ID. You can use this order ID to obtain the detailed information about the order in the Orders section of the User Center.</p>
     * 
     * <strong>example:</strong>
     * <p>22179******0904</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
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
