// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForBindSecureMobilePhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendVerificationCodeForBindSecureMobilePhoneResponseBody body;

    public static SendVerificationCodeForBindSecureMobilePhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationCodeForBindSecureMobilePhoneResponse self = new SendVerificationCodeForBindSecureMobilePhoneResponse();
        return TeaModel.build(map, self);
    }

    public SendVerificationCodeForBindSecureMobilePhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerificationCodeForBindSecureMobilePhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVerificationCodeForBindSecureMobilePhoneResponse setBody(SendVerificationCodeForBindSecureMobilePhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerificationCodeForBindSecureMobilePhoneResponseBody getBody() {
        return this.body;
    }

}
