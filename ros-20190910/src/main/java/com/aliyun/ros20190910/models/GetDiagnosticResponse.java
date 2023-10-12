// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetDiagnosticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDiagnosticResponseBody body;

    public static GetDiagnosticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosticResponse self = new GetDiagnosticResponse();
        return TeaModel.build(map, self);
    }

    public GetDiagnosticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiagnosticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiagnosticResponse setBody(GetDiagnosticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiagnosticResponseBody getBody() {
        return this.body;
    }

}
