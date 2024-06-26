// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTagsResponseBody body;

    public static QueryTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagsResponse self = new QueryTagsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagsResponse setBody(QueryTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagsResponseBody getBody() {
        return this.body;
    }

}
