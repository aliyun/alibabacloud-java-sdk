// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartTransferStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StartTransferStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTransferStreamResponse setBody(StartTransferStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTransferStreamResponseBody getBody() {
        return this.body;
    }

}
