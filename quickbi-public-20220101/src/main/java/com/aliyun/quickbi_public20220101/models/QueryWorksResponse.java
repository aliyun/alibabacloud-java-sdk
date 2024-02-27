// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWorksResponseBody body;

    public static QueryWorksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksResponse self = new QueryWorksResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWorksResponse setBody(QueryWorksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorksResponseBody getBody() {
        return this.body;
    }

}
