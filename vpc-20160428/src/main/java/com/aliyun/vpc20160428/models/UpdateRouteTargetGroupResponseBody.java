// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateRouteTargetGroupResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRouteTargetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteTargetGroupResponseBody self = new UpdateRouteTargetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRouteTargetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
