// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOssResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryOssResourcesResponse setBody(QueryOssResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOssResourcesResponseBody getBody() {
        return this.body;
    }

}
