// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class OnsRemoveInstanceTunnelTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsRemoveInstanceTunnelTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsRemoveInstanceTunnelTagResponseBody self = new OnsRemoveInstanceTunnelTagResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsRemoveInstanceTunnelTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
