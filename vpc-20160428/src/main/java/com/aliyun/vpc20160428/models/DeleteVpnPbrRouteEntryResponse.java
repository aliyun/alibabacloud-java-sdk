// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnPbrRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVpnPbrRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnPbrRouteEntryResponse self = new DeleteVpnPbrRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpnPbrRouteEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
