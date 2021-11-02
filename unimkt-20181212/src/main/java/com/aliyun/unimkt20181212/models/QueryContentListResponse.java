// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryContentListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryContentListResponseBody body;

    public static QueryContentListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContentListResponse self = new QueryContentListResponse();
        return TeaModel.build(map, self);
    }

    public QueryContentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryContentListResponse setBody(QueryContentListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryContentListResponseBody getBody() {
        return this.body;
    }

}
