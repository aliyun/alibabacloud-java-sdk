// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerHTTPSListenerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLoadBalancerHTTPSListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerHTTPSListenerResponseBody self = new CreateLoadBalancerHTTPSListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerHTTPSListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
