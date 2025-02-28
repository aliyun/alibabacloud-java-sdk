// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetJobDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobDiagnosisResponseBody body;

    public static GetJobDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobDiagnosisResponse self = new GetJobDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public GetJobDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobDiagnosisResponse setBody(GetJobDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobDiagnosisResponseBody getBody() {
        return this.body;
    }

}
