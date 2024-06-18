// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOrderForDeleteDBNodesResponseBody extends TeaModel {
    /**
     * <p>The instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>rm-7xv******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>221172852******</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49BC2500-8078-5AC4-A545-20AA5945B0E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrderForDeleteDBNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForDeleteDBNodesResponseBody self = new CreateOrderForDeleteDBNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderForDeleteDBNodesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateOrderForDeleteDBNodesResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateOrderForDeleteDBNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
