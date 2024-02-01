// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UnassociateRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassociateRouteTableResponse setBody(UnassociateRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateRouteTableResponseBody getBody() {
        return this.body;
    }

}
