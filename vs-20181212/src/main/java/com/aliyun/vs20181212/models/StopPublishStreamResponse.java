// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopPublishStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopPublishStreamResponseBody body;

    public static StopPublishStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        StopPublishStreamResponse self = new StopPublishStreamResponse();
        return TeaModel.build(map, self);
    }

    public StopPublishStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopPublishStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopPublishStreamResponse setBody(StopPublishStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StopPublishStreamResponseBody getBody() {
        return this.body;
    }

}
