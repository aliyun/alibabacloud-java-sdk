// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InvokeAnomalyDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeAnomalyDiagnosisResponseBody body;

    public static InvokeAnomalyDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeAnomalyDiagnosisResponse self = new InvokeAnomalyDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public InvokeAnomalyDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeAnomalyDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeAnomalyDiagnosisResponse setBody(InvokeAnomalyDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeAnomalyDiagnosisResponseBody getBody() {
        return this.body;
    }

}
