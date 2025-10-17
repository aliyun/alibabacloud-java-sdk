// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBClusterEndpointZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointZonalResponseBody self = new CreateDBClusterEndpointZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterEndpointZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
