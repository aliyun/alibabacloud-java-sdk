// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMaterialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMaterialResponseBody body;

    public static QueryMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialResponse self = new QueryMaterialResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMaterialResponse setBody(QueryMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMaterialResponseBody getBody() {
        return this.body;
    }

}
