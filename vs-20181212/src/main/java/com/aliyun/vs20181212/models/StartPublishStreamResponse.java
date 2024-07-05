// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartPublishStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartPublishStreamResponseBody body;

    public static StartPublishStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPublishStreamResponse self = new StartPublishStreamResponse();
        return TeaModel.build(map, self);
    }

    public StartPublishStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPublishStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPublishStreamResponse setBody(StartPublishStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPublishStreamResponseBody getBody() {
        return this.body;
    }

}
