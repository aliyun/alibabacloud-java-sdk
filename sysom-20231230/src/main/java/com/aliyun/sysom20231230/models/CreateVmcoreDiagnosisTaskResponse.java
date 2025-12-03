// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateVmcoreDiagnosisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVmcoreDiagnosisTaskResponseBody body;

    public static CreateVmcoreDiagnosisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVmcoreDiagnosisTaskResponse self = new CreateVmcoreDiagnosisTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVmcoreDiagnosisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVmcoreDiagnosisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVmcoreDiagnosisTaskResponse setBody(CreateVmcoreDiagnosisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVmcoreDiagnosisTaskResponseBody getBody() {
        return this.body;
    }

}
