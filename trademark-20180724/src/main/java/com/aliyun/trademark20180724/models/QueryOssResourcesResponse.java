// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOssResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOssResourcesResponseBody body;

    public static QueryOssResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOssResourcesResponse self = new QueryOssResourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryOssResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOssResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOssResourcesResponse setBody(QueryOssResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOssResourcesResponseBody getBody() {
        return this.body;
    }

}
