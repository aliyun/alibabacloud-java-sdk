// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterEndpointZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F2A9EFA7-915F-4572-8299-85A307******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterEndpointZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterEndpointZonalResponseBody self = new ModifyDBClusterEndpointZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterEndpointZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
