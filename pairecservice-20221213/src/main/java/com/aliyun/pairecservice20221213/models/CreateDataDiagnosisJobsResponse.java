// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateDataDiagnosisJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataDiagnosisJobsResponseBody body;

    public static CreateDataDiagnosisJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDiagnosisJobsResponse self = new CreateDataDiagnosisJobsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataDiagnosisJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataDiagnosisJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataDiagnosisJobsResponse setBody(CreateDataDiagnosisJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataDiagnosisJobsResponseBody getBody() {
        return this.body;
    }

}
