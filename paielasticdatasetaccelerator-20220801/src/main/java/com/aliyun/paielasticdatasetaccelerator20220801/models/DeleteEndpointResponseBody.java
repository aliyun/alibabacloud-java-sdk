// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DeleteEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointResponseBody self = new DeleteEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
