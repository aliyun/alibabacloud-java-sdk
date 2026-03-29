// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateDataDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataDiagnosisResponseBody body;

    public static CreateDataDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDiagnosisResponse self = new CreateDataDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataDiagnosisResponse setBody(CreateDataDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataDiagnosisResponseBody getBody() {
        return this.body;
    }

}
