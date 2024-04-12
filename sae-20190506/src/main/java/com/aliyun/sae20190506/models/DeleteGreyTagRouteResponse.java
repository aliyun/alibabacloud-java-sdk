// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteGreyTagRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGreyTagRouteResponseBody body;

    public static DeleteGreyTagRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGreyTagRouteResponse self = new DeleteGreyTagRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGreyTagRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGreyTagRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGreyTagRouteResponse setBody(DeleteGreyTagRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGreyTagRouteResponseBody getBody() {
        return this.body;
    }

}
