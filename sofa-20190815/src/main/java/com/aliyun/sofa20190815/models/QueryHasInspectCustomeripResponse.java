// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectCustomeripResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectCustomeripResponseBody body;

    public static QueryHasInspectCustomeripResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectCustomeripResponse self = new QueryHasInspectCustomeripResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectCustomeripResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectCustomeripResponse setBody(QueryHasInspectCustomeripResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectCustomeripResponseBody getBody() {
        return this.body;
    }

}
