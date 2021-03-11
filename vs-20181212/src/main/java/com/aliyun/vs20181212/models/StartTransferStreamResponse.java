// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartTransferStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartTransferStreamResponseBody body;

    public static StartTransferStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTransferStreamResponse self = new StartTransferStreamResponse();
        return TeaModel.build(map, self);
    }

    public StartTransferStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTransferStreamResponse setBody(StartTransferStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTransferStreamResponseBody getBody() {
        return this.body;
    }

}
