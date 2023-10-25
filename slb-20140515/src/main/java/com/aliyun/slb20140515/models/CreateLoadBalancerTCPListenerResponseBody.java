// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerTCPListenerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLoadBalancerTCPListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerTCPListenerResponseBody self = new CreateLoadBalancerTCPListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerTCPListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
