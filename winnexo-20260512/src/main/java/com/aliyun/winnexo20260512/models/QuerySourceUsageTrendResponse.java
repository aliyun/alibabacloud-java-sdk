// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySourceUsageTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySourceUsageTrendResponseBody body;

    public static QuerySourceUsageTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySourceUsageTrendResponse self = new QuerySourceUsageTrendResponse();
        return TeaModel.build(map, self);
    }

    public QuerySourceUsageTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySourceUsageTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySourceUsageTrendResponse setBody(QuerySourceUsageTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySourceUsageTrendResponseBody getBody() {
        return this.body;
    }

}
