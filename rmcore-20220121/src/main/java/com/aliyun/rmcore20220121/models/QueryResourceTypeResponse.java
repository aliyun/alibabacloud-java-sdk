// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class QueryResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryResourceTypeResponseBody body;

    public static QueryResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceTypeResponse self = new QueryResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResourceTypeResponse setBody(QueryResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResourceTypeResponseBody getBody() {
        return this.body;
    }

}
