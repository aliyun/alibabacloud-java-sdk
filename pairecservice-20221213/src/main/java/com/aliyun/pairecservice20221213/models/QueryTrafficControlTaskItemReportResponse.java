// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTaskItemReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrafficControlTaskItemReportResponseBody body;

    public static QueryTrafficControlTaskItemReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrafficControlTaskItemReportResponse self = new QueryTrafficControlTaskItemReportResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrafficControlTaskItemReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrafficControlTaskItemReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrafficControlTaskItemReportResponse setBody(QueryTrafficControlTaskItemReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrafficControlTaskItemReportResponseBody getBody() {
        return this.body;
    }

}
