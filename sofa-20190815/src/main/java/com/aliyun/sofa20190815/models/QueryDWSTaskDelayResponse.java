// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSTaskDelayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDWSTaskDelayResponseBody body;

    public static QueryDWSTaskDelayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSTaskDelayResponse self = new QueryDWSTaskDelayResponse();
        return TeaModel.build(map, self);
    }

    public QueryDWSTaskDelayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDWSTaskDelayResponse setBody(QueryDWSTaskDelayResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDWSTaskDelayResponseBody getBody() {
        return this.body;
    }

}
