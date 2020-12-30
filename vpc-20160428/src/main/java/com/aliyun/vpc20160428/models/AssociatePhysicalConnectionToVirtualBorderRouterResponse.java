// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociatePhysicalConnectionToVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociatePhysicalConnectionToVirtualBorderRouterResponseBody body;

    public static AssociatePhysicalConnectionToVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociatePhysicalConnectionToVirtualBorderRouterResponse self = new AssociatePhysicalConnectionToVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterResponse setBody(AssociatePhysicalConnectionToVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociatePhysicalConnectionToVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
