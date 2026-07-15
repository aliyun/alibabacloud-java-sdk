// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateRayHistoryServerResponseBody extends TeaModel {
    /**
     * <p>The ID of the created Ray History Server.</p>
     * 
     * <strong>example:</strong>
     * <p>rhsxxxx</p>
     */
    @NameInMap("RayHistoryServerId")
    public String rayHistoryServerId;

    /**
     * <p>The request ID of this call, used for diagnostics and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRayHistoryServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRayHistoryServerResponseBody self = new CreateRayHistoryServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRayHistoryServerResponseBody setRayHistoryServerId(String rayHistoryServerId) {
        this.rayHistoryServerId = rayHistoryServerId;
        return this;
    }
    public String getRayHistoryServerId() {
        return this.rayHistoryServerId;
    }

    public CreateRayHistoryServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
