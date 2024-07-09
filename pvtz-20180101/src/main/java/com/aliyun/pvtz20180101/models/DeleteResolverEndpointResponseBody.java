// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverEndpointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35134B4A-CEC0-43C8-AAD4-BA54AE3268B5</p>
     */
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
