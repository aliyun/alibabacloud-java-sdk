// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerInternetSpecResponseBody extends TeaModel {
    /**
     * <p>The order ID of the subscription CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20142961978****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLoadBalancerInternetSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerInternetSpecResponseBody self = new ModifyLoadBalancerInternetSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerInternetSpecResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyLoadBalancerInternetSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
