// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTradeMarkApplicationsResponseBody body;

    public static QueryTradeMarkApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationsResponse self = new QueryTradeMarkApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeMarkApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTradeMarkApplicationsResponse setBody(QueryTradeMarkApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeMarkApplicationsResponseBody getBody() {
        return this.body;
    }

}
