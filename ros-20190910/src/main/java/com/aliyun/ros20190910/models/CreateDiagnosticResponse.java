// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateDiagnosticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDiagnosticResponseBody body;

    public static CreateDiagnosticResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticResponse self = new CreateDiagnosticResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiagnosticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiagnosticResponse setBody(CreateDiagnosticResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiagnosticResponseBody getBody() {
        return this.body;
    }

}
