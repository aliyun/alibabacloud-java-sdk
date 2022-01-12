// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryAppResValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppResValueResponseBody body;

    public static QueryAppResValueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppResValueResponse self = new QueryAppResValueResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppResValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppResValueResponse setBody(QueryAppResValueResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppResValueResponseBody getBody() {
        return this.body;
    }

}
