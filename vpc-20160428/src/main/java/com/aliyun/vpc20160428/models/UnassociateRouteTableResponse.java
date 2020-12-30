// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnassociateRouteTableResponseBody body;

    public static UnassociateRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateRouteTableResponse self = new UnassociateRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateRouteTableResponse setBody(UnassociateRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateRouteTableResponseBody getBody() {
        return this.body;
    }

}
