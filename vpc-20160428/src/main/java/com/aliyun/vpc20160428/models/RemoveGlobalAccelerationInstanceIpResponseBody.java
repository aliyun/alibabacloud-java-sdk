// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveGlobalAccelerationInstanceIpResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveGlobalAccelerationInstanceIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveGlobalAccelerationInstanceIpResponseBody self = new RemoveGlobalAccelerationInstanceIpResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveGlobalAccelerationInstanceIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
