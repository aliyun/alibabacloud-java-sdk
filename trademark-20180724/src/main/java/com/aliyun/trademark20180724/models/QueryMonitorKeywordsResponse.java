// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMonitorKeywordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMonitorKeywordsResponseBody body;

    public static QueryMonitorKeywordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorKeywordsResponse self = new QueryMonitorKeywordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonitorKeywordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonitorKeywordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonitorKeywordsResponse setBody(QueryMonitorKeywordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonitorKeywordsResponseBody getBody() {
        return this.body;
    }

}
