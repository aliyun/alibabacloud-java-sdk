// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnPbrRouteEntryPriorityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpnPbrRouteEntryPriorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnPbrRouteEntryPriorityResponseBody self = new ModifyVpnPbrRouteEntryPriorityResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpnPbrRouteEntryPriorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
