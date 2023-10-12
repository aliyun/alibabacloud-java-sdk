// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDiagnosticResponseBody body;

    public static DeleteDiagnosticResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnosticResponse self = new DeleteDiagnosticResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnosticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDiagnosticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDiagnosticResponse setBody(DeleteDiagnosticResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDiagnosticResponseBody getBody() {
        return this.body;
    }

}
