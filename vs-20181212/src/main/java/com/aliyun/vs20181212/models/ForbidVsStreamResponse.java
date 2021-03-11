// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ForbidVsStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ForbidVsStreamResponse setBody(ForbidVsStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ForbidVsStreamResponseBody getBody() {
        return this.body;
    }

}
