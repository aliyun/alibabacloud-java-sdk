// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class AuditPublicTemplateRegistrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuditPublicTemplateRegistrationResponseBody body;

    public static AuditPublicTemplateRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        AuditPublicTemplateRegistrationResponse self = new AuditPublicTemplateRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public AuditPublicTemplateRegistrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuditPublicTemplateRegistrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuditPublicTemplateRegistrationResponse setBody(AuditPublicTemplateRegistrationResponseBody body) {
        this.body = body;
        return this;
    }
    public AuditPublicTemplateRegistrationResponseBody getBody() {
        return this.body;
    }

}
