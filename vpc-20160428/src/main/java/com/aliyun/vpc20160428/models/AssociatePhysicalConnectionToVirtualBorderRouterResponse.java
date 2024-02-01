// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociatePhysicalConnectionToVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AssociatePhysicalConnectionToVirtualBorderRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterResponse setBody(AssociatePhysicalConnectionToVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociatePhysicalConnectionToVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
