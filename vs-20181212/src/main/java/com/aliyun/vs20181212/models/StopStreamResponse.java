// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StopStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopStreamResponse setBody(StopStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StopStreamResponseBody getBody() {
        return this.body;
    }

}
