// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ApplyForTryOnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyForTryOnResponseBody body;

    public static ApplyForTryOnResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyForTryOnResponse self = new ApplyForTryOnResponse();
        return TeaModel.build(map, self);
    }

    public ApplyForTryOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyForTryOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyForTryOnResponse setBody(ApplyForTryOnResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyForTryOnResponseBody getBody() {
        return this.body;
    }

}
