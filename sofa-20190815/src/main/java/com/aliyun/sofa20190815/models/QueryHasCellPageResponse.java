// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCellPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCellPageResponseBody body;

    public static QueryHasCellPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCellPageResponse self = new QueryHasCellPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCellPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCellPageResponse setBody(QueryHasCellPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCellPageResponseBody getBody() {
        return this.body;
    }

}
