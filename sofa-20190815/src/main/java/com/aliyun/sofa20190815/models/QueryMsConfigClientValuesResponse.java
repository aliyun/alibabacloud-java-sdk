// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigClientValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsConfigClientValuesResponseBody body;

    public static QueryMsConfigClientValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigClientValuesResponse self = new QueryMsConfigClientValuesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigClientValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsConfigClientValuesResponse setBody(QueryMsConfigClientValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsConfigClientValuesResponseBody getBody() {
        return this.body;
    }

}
