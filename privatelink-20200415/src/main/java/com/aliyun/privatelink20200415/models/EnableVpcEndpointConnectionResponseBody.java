// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableVpcEndpointConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcEndpointConnectionResponseBody self = new EnableVpcEndpointConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableVpcEndpointConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
