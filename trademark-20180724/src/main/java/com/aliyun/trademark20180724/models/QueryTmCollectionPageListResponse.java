// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTmCollectionPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTmCollectionPageListResponseBody body;

    public static QueryTmCollectionPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTmCollectionPageListResponse self = new QueryTmCollectionPageListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTmCollectionPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTmCollectionPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTmCollectionPageListResponse setBody(QueryTmCollectionPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTmCollectionPageListResponseBody getBody() {
        return this.body;
    }

}
