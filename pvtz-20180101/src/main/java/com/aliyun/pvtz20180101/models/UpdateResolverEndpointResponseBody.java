// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResolverEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResolverEndpointResponseBody self = new UpdateResolverEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResolverEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
