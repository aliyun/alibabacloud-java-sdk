// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListDataDiagnosisReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataDiagnosisReportsResponseBody body;

    public static ListDataDiagnosisReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnosisReportsResponse self = new ListDataDiagnosisReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnosisReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataDiagnosisReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataDiagnosisReportsResponse setBody(ListDataDiagnosisReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataDiagnosisReportsResponseBody getBody() {
        return this.body;
    }

}
