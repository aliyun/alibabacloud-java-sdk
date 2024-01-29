// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetDiagnosisResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiagnosisResultResponseBody body;

    public static GetDiagnosisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResultResponse self = new GetDiagnosisResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiagnosisResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiagnosisResultResponse setBody(GetDiagnosisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiagnosisResultResponseBody getBody() {
        return this.body;
    }

}
