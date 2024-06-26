// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerResponseBody extends TeaModel {
    /**
     * <p>The ID of the NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-83ckzc8d4xlp8o****</p>
     */
    @NameInMap("LoadbalancerId")
    public String loadbalancerId;

    /**
     * <p>The ID of the order for the NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20230000</p>
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

    public static CreateLoadBalancerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerResponseBody self = new CreateLoadBalancerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerResponseBody setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }
    public String getLoadbalancerId() {
        return this.loadbalancerId;
    }

    public CreateLoadBalancerResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateLoadBalancerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
