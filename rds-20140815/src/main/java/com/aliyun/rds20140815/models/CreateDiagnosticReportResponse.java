// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDiagnosticReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDiagnosticReportResponseBody body;

    public static CreateDiagnosticReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticReportResponse self = new CreateDiagnosticReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiagnosticReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiagnosticReportResponse setBody(CreateDiagnosticReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiagnosticReportResponseBody getBody() {
        return this.body;
    }

}
