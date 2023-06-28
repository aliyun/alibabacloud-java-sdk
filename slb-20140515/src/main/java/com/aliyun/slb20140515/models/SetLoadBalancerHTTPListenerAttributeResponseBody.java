// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>## Prerequisites</p>
     * <br>
     * <p>*   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~27577~~).</p>
     * <p>*   An HTTP listener is created. For more information about how to create an HTTP listener, see [CreateLoadBalancerHTTPListener](~~27592~~).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetLoadBalancerHTTPListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerHTTPListenerAttributeResponseBody self = new SetLoadBalancerHTTPListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerHTTPListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
