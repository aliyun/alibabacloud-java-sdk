// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class OnsAddInstanceTunnelTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsAddInstanceTunnelTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsAddInstanceTunnelTagResponseBody self = new OnsAddInstanceTunnelTagResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsAddInstanceTunnelTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
