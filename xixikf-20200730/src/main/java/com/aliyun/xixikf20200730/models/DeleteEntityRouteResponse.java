// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class DeleteEntityRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEntityRouteResponseBody body;

    public static DeleteEntityRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityRouteResponse self = new DeleteEntityRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEntityRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEntityRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEntityRouteResponse setBody(DeleteEntityRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEntityRouteResponseBody getBody() {
        return this.body;
    }

}
