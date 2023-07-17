// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryNameListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNameListResponseBody body;

    public static QueryNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNameListResponse self = new QueryNameListResponse();
        return TeaModel.build(map, self);
    }

    public QueryNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNameListResponse setBody(QueryNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNameListResponseBody getBody() {
        return this.body;
    }

}
