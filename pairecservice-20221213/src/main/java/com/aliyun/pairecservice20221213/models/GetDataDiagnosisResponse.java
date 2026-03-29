// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetDataDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataDiagnosisResponseBody body;

    public static GetDataDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataDiagnosisResponse self = new GetDataDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public GetDataDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataDiagnosisResponse setBody(GetDataDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataDiagnosisResponseBody getBody() {
        return this.body;
    }

}
