// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagGlobalRouteProtocolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagGlobalRouteProtocolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagGlobalRouteProtocolResponseBody self = new ModifySagGlobalRouteProtocolResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagGlobalRouteProtocolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
