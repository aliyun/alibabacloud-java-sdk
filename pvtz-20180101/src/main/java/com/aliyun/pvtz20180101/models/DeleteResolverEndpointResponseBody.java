// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResolverEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResolverEndpointResponseBody self = new DeleteResolverEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResolverEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
