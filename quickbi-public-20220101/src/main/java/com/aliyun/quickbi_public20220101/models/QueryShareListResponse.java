// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryShareListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryShareListResponseBody body;

    public static QueryShareListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShareListResponse self = new QueryShareListResponse();
        return TeaModel.build(map, self);
    }

    public QueryShareListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShareListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShareListResponse setBody(QueryShareListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShareListResponseBody getBody() {
        return this.body;
    }

}
