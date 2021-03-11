// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartStreamResponseBody body;

    public static StartStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        StartStreamResponse self = new StartStreamResponse();
        return TeaModel.build(map, self);
    }

    public StartStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartStreamResponse setBody(StartStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StartStreamResponseBody getBody() {
        return this.body;
    }

}
