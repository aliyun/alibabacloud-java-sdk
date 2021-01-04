// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRouteProtocolBgpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagRouteProtocolBgpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRouteProtocolBgpResponseBody self = new ModifySagRouteProtocolBgpResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagRouteProtocolBgpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
