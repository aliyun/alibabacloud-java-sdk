// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasTenantlistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasTenantlistResponseBody body;

    public static QueryHasTenantlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasTenantlistResponse self = new QueryHasTenantlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasTenantlistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasTenantlistResponse setBody(QueryHasTenantlistResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasTenantlistResponseBody getBody() {
        return this.body;
    }

}
