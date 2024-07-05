// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ForbidVsStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ForbidVsStreamResponseBody body;

    public static ForbidVsStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ForbidVsStreamResponse self = new ForbidVsStreamResponse();
        return TeaModel.build(map, self);
    }

    public ForbidVsStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForbidVsStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForbidVsStreamResponse setBody(ForbidVsStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ForbidVsStreamResponseBody getBody() {
        return this.body;
    }

}
