// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryDataDiagnosisStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDataDiagnosisStatisticsResponseBody body;

    public static QueryDataDiagnosisStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataDiagnosisStatisticsResponse self = new QueryDataDiagnosisStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataDiagnosisStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataDiagnosisStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDataDiagnosisStatisticsResponse setBody(QueryDataDiagnosisStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataDiagnosisStatisticsResponseBody getBody() {
        return this.body;
    }

}
