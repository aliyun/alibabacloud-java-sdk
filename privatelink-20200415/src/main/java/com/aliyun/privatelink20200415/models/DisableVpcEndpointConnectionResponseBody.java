// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DisableVpcEndpointConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableVpcEndpointConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcEndpointConnectionResponseBody self = new DisableVpcEndpointConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableVpcEndpointConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
