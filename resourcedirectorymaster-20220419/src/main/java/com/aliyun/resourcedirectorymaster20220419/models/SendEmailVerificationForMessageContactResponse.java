// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SendEmailVerificationForMessageContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendEmailVerificationForMessageContactResponseBody body;

    public static SendEmailVerificationForMessageContactResponse build(java.util.Map<String, ?> map) throws Exception {
        SendEmailVerificationForMessageContactResponse self = new SendEmailVerificationForMessageContactResponse();
        return TeaModel.build(map, self);
    }

    public SendEmailVerificationForMessageContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendEmailVerificationForMessageContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendEmailVerificationForMessageContactResponse setBody(SendEmailVerificationForMessageContactResponseBody body) {
        this.body = body;
        return this;
    }
    public SendEmailVerificationForMessageContactResponseBody getBody() {
        return this.body;
    }

}
