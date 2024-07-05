// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StartStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartStreamResponse setBody(StartStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StartStreamResponseBody getBody() {
        return this.body;
    }

}
