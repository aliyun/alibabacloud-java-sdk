// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsSubscriptionsResponseBody body;

    public static QueryRmsSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsSubscriptionsResponse self = new QueryRmsSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsSubscriptionsResponse setBody(QueryRmsSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
