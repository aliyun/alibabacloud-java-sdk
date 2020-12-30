// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociatePhysicalConnectionFromVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody body;

    public static UnassociatePhysicalConnectionFromVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociatePhysicalConnectionFromVirtualBorderRouterResponse self = new UnassociatePhysicalConnectionFromVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponse setBody(UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
