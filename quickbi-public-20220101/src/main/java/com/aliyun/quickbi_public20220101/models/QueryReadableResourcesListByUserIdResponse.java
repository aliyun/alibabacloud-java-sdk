// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReadableResourcesListByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReadableResourcesListByUserIdResponseBody body;

    public static QueryReadableResourcesListByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReadableResourcesListByUserIdResponse self = new QueryReadableResourcesListByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryReadableResourcesListByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReadableResourcesListByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReadableResourcesListByUserIdResponse setBody(QueryReadableResourcesListByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReadableResourcesListByUserIdResponseBody getBody() {
        return this.body;
    }

}
