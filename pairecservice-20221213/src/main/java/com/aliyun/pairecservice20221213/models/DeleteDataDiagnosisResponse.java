// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteDataDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataDiagnosisResponseBody body;

    public static DeleteDataDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataDiagnosisResponse self = new DeleteDataDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataDiagnosisResponse setBody(DeleteDataDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataDiagnosisResponseBody getBody() {
        return this.body;
    }

}
