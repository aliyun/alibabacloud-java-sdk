// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRouteTableResponseBody body;

    public static CreateRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTableResponse self = new CreateRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouteTableResponse setBody(CreateRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteTableResponseBody getBody() {
        return this.body;
    }

}
