// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class SendVerificationCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendVerificationCodeResponseBody body;

    public static SendVerificationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationCodeResponse self = new SendVerificationCodeResponse();
        return TeaModel.build(map, self);
    }

    public SendVerificationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerificationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVerificationCodeResponse setBody(SendVerificationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerificationCodeResponseBody getBody() {
        return this.body;
    }

}
