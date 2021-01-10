// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServiceSubKeysResponseBody body;

    public static QueryMsSgServiceSubKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubKeysResponse self = new QueryMsSgServiceSubKeysResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServiceSubKeysResponse setBody(QueryMsSgServiceSubKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServiceSubKeysResponseBody getBody() {
        return this.body;
    }

}
