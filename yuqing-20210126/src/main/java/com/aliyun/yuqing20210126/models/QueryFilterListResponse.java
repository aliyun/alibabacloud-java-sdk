// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryFilterListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFilterListResponseBody body;

    public static QueryFilterListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFilterListResponse self = new QueryFilterListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFilterListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFilterListResponse setBody(QueryFilterListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFilterListResponseBody getBody() {
        return this.body;
    }

}
