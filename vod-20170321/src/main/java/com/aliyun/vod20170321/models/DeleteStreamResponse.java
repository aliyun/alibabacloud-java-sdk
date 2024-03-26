// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStreamResponseBody body;

    public static DeleteStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamResponse self = new DeleteStreamResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStreamResponse setBody(DeleteStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStreamResponseBody getBody() {
        return this.body;
    }

}
