// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnPbrRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpnPbrRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnPbrRouteEntryResponseBody self = new DeleteVpnPbrRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpnPbrRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
