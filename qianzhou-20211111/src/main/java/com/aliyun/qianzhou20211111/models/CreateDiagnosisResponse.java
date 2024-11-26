// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class CreateDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDiagnosisResponseBody body;

    public static CreateDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosisResponse self = new CreateDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiagnosisResponse setBody(CreateDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiagnosisResponseBody getBody() {
        return this.body;
    }

}
