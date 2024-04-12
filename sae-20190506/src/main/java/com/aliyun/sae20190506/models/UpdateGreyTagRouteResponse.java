// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateGreyTagRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGreyTagRouteResponseBody body;

    public static UpdateGreyTagRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGreyTagRouteResponse self = new UpdateGreyTagRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGreyTagRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGreyTagRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGreyTagRouteResponse setBody(UpdateGreyTagRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGreyTagRouteResponseBody getBody() {
        return this.body;
    }

}
