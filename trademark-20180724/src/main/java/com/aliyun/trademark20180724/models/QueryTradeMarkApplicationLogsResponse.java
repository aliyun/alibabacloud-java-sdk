// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTradeMarkApplicationLogsResponseBody body;

    public static QueryTradeMarkApplicationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationLogsResponse self = new QueryTradeMarkApplicationLogsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeMarkApplicationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTradeMarkApplicationLogsResponse setBody(QueryTradeMarkApplicationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeMarkApplicationLogsResponseBody getBody() {
        return this.body;
    }

}
