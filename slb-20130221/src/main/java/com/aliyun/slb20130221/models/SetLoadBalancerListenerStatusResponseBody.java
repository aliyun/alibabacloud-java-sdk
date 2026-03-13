// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20130221.models;

import com.aliyun.tea.*;

public class SetLoadBalancerListenerStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetLoadBalancerListenerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerListenerStatusResponseBody self = new SetLoadBalancerListenerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerListenerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
