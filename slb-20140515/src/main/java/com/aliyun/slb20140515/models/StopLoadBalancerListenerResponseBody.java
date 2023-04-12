// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class StopLoadBalancerListenerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopLoadBalancerListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLoadBalancerListenerResponseBody self = new StopLoadBalancerListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLoadBalancerListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
