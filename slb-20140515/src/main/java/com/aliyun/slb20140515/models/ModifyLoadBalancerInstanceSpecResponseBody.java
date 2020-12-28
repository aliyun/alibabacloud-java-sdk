// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerInstanceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public Long orderId;

    public static ModifyLoadBalancerInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerInstanceSpecResponseBody self = new ModifyLoadBalancerInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyLoadBalancerInstanceSpecResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
