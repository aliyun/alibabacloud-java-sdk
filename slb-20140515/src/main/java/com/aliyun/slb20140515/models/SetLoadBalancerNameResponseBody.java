// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerNameResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetLoadBalancerNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerNameResponseBody self = new SetLoadBalancerNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
