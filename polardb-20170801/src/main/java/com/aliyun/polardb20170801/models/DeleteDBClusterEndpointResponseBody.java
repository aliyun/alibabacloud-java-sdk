// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBClusterEndpointResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBClusterEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterEndpointResponseBody self = new DeleteDBClusterEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
