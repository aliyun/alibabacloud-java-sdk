// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InvokeDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeDiagnosisResponseBody body;

    public static InvokeDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeDiagnosisResponse self = new InvokeDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public InvokeDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeDiagnosisResponse setBody(InvokeDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeDiagnosisResponseBody getBody() {
        return this.body;
    }

}
