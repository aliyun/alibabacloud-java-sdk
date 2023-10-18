// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnRouteEntryWeightResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpnRouteEntryWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnRouteEntryWeightResponseBody self = new ModifyVpnRouteEntryWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpnRouteEntryWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
