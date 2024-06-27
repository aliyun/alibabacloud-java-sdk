// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDataServiceListResponseBody body;

    public static QueryDataServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataServiceListResponse self = new QueryDataServiceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataServiceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataServiceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDataServiceListResponse setBody(QueryDataServiceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataServiceListResponseBody getBody() {
        return this.body;
    }

}
