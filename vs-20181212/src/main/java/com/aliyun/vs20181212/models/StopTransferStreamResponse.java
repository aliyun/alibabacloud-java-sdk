// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopTransferStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopTransferStreamResponseBody body;

    public static StopTransferStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTransferStreamResponse self = new StopTransferStreamResponse();
        return TeaModel.build(map, self);
    }

    public StopTransferStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTransferStreamResponse setBody(StopTransferStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTransferStreamResponseBody getBody() {
        return this.body;
    }

}
