// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBClusterEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointResponseBody self = new CreateDBClusterEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
