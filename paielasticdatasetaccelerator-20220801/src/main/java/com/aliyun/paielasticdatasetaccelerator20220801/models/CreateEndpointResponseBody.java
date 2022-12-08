// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateEndpointResponseBody extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

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
