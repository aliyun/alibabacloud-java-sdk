// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DeleteVnetRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVnetRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVnetRouteEntryResponse self = new DeleteVnetRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVnetRouteEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
