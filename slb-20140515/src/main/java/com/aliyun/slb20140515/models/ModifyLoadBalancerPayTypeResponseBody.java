// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerPayTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public Long orderId;

    public static ModifyLoadBalancerPayTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerPayTypeResponseBody self = new ModifyLoadBalancerPayTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerPayTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyLoadBalancerPayTypeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
