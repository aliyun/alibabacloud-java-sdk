// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopTransferStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StopTransferStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTransferStreamResponse setBody(StopTransferStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTransferStreamResponseBody getBody() {
        return this.body;
    }

}
