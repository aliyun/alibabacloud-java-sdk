// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverEndpointResponseBody extends TeaModel {
    /**
     * <p>The outbound endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32436208-E1AF-4DAB-B3B8-24F5F25B0950</p>
     */
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
