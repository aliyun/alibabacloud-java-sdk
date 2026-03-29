// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListDataDiagnosisJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataDiagnosisJobsResponseBody body;

    public static ListDataDiagnosisJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnosisJobsResponse self = new ListDataDiagnosisJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnosisJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataDiagnosisJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataDiagnosisJobsResponse setBody(ListDataDiagnosisJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataDiagnosisJobsResponseBody getBody() {
        return this.body;
    }

}
