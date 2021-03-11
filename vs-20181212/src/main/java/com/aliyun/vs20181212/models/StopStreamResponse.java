// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopStreamResponseBody body;

    public static StopStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        StopStreamResponse self = new StopStreamResponse();
        return TeaModel.build(map, self);
    }

    public StopStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopStreamResponse setBody(StopStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StopStreamResponseBody getBody() {
        return this.body;
    }

}
