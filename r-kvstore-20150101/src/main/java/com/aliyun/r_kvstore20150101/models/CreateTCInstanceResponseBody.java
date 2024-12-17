// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTCInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>tc-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22179******0904</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>561AFBF1-BE20-44DB-9BD1-6988B53E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTCInstanceResponseBody self = new CreateTCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTCInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTCInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateTCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
