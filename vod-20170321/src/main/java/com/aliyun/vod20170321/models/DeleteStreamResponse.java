// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteStreamResponse setBody(DeleteStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStreamResponseBody getBody() {
        return this.body;
    }

}
