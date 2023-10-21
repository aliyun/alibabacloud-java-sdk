// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOrderForDeleteDBNodesResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OrderId")
    public Long orderId;

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
