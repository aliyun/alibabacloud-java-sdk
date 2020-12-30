// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateRouteTableResponseBody body;

    public static AssociateRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTableResponse self = new AssociateRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public AssociateRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateRouteTableResponse setBody(AssociateRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateRouteTableResponseBody getBody() {
        return this.body;
    }

}
