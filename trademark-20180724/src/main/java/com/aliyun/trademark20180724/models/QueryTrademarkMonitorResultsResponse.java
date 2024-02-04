// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkMonitorResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrademarkMonitorResultsResponseBody body;

    public static QueryTrademarkMonitorResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkMonitorResultsResponse self = new QueryTrademarkMonitorResultsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkMonitorResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkMonitorResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkMonitorResultsResponse setBody(QueryTrademarkMonitorResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkMonitorResultsResponseBody getBody() {
        return this.body;
    }

}
