// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverEndpointResponseBody extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddResolverEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddResolverEndpointResponseBody self = new AddResolverEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public AddResolverEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public AddResolverEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
