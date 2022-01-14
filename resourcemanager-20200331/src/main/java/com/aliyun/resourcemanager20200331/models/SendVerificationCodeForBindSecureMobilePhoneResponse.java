// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForBindSecureMobilePhoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SendVerificationCodeForBindSecureMobilePhoneResponse setBody(SendVerificationCodeForBindSecureMobilePhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerificationCodeForBindSecureMobilePhoneResponseBody getBody() {
        return this.body;
    }

}
