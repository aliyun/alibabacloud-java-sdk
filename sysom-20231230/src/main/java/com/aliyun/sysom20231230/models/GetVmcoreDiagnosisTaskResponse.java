// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetVmcoreDiagnosisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVmcoreDiagnosisTaskResponseBody body;

    public static GetVmcoreDiagnosisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVmcoreDiagnosisTaskResponse self = new GetVmcoreDiagnosisTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetVmcoreDiagnosisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVmcoreDiagnosisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVmcoreDiagnosisTaskResponse setBody(GetVmcoreDiagnosisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVmcoreDiagnosisTaskResponseBody getBody() {
        return this.body;
    }

}
