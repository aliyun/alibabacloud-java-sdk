// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class PublishVpnRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PublishVpnRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishVpnRouteEntryResponseBody self = new PublishVpnRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishVpnRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
