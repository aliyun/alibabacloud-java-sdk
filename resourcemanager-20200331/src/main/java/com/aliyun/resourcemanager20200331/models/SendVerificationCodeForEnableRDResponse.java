// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForEnableRDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendVerificationCodeForEnableRDResponseBody body;

    public static SendVerificationCodeForEnableRDResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationCodeForEnableRDResponse self = new SendVerificationCodeForEnableRDResponse();
        return TeaModel.build(map, self);
    }

    public SendVerificationCodeForEnableRDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerificationCodeForEnableRDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVerificationCodeForEnableRDResponse setBody(SendVerificationCodeForEnableRDResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerificationCodeForEnableRDResponseBody getBody() {
        return this.body;
    }

}
