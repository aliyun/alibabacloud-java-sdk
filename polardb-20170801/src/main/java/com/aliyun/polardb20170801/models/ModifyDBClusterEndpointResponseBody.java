// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterEndpointResponseBody self = new ModifyDBClusterEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
