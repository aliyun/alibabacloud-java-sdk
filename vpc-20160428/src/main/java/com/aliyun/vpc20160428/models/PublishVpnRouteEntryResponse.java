// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class PublishVpnRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static PublishVpnRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishVpnRouteEntryResponse self = new PublishVpnRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public PublishVpnRouteEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
