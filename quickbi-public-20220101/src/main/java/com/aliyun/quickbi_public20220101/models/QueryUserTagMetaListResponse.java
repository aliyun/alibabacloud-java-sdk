// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserTagMetaListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserTagMetaListResponseBody body;

    public static QueryUserTagMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTagMetaListResponse self = new QueryUserTagMetaListResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserTagMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserTagMetaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserTagMetaListResponse setBody(QueryUserTagMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserTagMetaListResponseBody getBody() {
        return this.body;
    }

}
