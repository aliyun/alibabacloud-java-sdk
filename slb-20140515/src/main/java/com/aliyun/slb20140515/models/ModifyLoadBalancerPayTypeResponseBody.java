// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerPayTypeResponseBody extends TeaModel {
    /**
     * <p>The order ID of the subscription CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20212961978891</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLoadBalancerPayTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerPayTypeResponseBody self = new ModifyLoadBalancerPayTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerPayTypeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyLoadBalancerPayTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
