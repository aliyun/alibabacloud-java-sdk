// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class VerifyConsumeMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyConsumeMessageResponseBody body;

    public static VerifyConsumeMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyConsumeMessageResponse self = new VerifyConsumeMessageResponse();
        return TeaModel.build(map, self);
    }

    public VerifyConsumeMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyConsumeMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyConsumeMessageResponse setBody(VerifyConsumeMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyConsumeMessageResponseBody getBody() {
        return this.body;
    }

}
