// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateDataDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataDiagnosisResponseBody body;

    public static UpdateDataDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataDiagnosisResponse self = new UpdateDataDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataDiagnosisResponse setBody(UpdateDataDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataDiagnosisResponseBody getBody() {
        return this.body;
    }

}
