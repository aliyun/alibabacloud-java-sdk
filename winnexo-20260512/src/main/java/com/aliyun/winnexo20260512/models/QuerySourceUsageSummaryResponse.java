// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySourceUsageSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySourceUsageSummaryResponseBody body;

    public static QuerySourceUsageSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySourceUsageSummaryResponse self = new QuerySourceUsageSummaryResponse();
        return TeaModel.build(map, self);
    }

    public QuerySourceUsageSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySourceUsageSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySourceUsageSummaryResponse setBody(QuerySourceUsageSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySourceUsageSummaryResponseBody getBody() {
        return this.body;
    }

}
