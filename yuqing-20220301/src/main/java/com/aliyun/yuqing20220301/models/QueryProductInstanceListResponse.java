// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class QueryProductInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryProductInstanceListResponseBody body;

    public static QueryProductInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInstanceListResponse self = new QueryProductInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductInstanceListResponse setBody(QueryProductInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductInstanceListResponseBody getBody() {
        return this.body;
    }

}
