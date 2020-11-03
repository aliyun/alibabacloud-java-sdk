// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class CreateVnetRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateVnetRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVnetRouteEntryResponse self = new CreateVnetRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateVnetRouteEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
