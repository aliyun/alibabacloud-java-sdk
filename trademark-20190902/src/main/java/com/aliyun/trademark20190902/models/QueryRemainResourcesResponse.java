// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryRemainResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRemainResourcesResponseBody body;

    public static QueryRemainResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRemainResourcesResponse self = new QueryRemainResourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRemainResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRemainResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRemainResourcesResponse setBody(QueryRemainResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRemainResourcesResponseBody getBody() {
        return this.body;
    }

}
