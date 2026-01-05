// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class UnbindEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindEndpointResponseBody self = new UnbindEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
