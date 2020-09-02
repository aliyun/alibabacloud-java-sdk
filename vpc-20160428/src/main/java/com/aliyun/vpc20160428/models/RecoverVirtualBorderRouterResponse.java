// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RecoverVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RecoverVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverVirtualBorderRouterResponse self = new RecoverVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public RecoverVirtualBorderRouterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
