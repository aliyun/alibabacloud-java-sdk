// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class ReceiveMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReceiveMessageResponseBody body;

    public static ReceiveMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReceiveMessageResponse self = new ReceiveMessageResponse();
        return TeaModel.build(map, self);
    }

    public ReceiveMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReceiveMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReceiveMessageResponse setBody(ReceiveMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReceiveMessageResponseBody getBody() {
        return this.body;
    }

}
