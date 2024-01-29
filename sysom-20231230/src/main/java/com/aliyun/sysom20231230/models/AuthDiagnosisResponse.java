// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class AuthDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthDiagnosisResponseBody body;

    public static AuthDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthDiagnosisResponse self = new AuthDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public AuthDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthDiagnosisResponse setBody(AuthDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthDiagnosisResponseBody getBody() {
        return this.body;
    }

}
