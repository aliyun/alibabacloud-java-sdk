// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QuerySecurityCheckReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySecurityCheckReportResponseBody body;

    public static QuerySecurityCheckReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityCheckReportResponse self = new QuerySecurityCheckReportResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecurityCheckReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySecurityCheckReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySecurityCheckReportResponse setBody(QuerySecurityCheckReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySecurityCheckReportResponseBody getBody() {
        return this.body;
    }

}
