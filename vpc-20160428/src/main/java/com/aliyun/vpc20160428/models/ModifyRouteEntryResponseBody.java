// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteEntryResponseBody self = new ModifyRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
