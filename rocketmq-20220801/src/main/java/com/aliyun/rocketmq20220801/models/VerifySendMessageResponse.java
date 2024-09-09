// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class VerifySendMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifySendMessageResponseBody body;

    public static VerifySendMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifySendMessageResponse self = new VerifySendMessageResponse();
        return TeaModel.build(map, self);
    }

    public VerifySendMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifySendMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifySendMessageResponse setBody(VerifySendMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifySendMessageResponseBody getBody() {
        return this.body;
    }

}
