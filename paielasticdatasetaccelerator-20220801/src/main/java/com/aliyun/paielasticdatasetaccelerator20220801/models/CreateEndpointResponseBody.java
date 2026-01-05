// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>end-5zk866779me51jgu3w</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <strong>example:</strong>
     * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointResponseBody self = new CreateEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public CreateEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
