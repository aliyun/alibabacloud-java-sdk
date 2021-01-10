// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqRouterResponseBody body;

    public static QueryMqSofamqRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqRouterResponse self = new QueryMqSofamqRouterResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqRouterResponse setBody(QueryMqSofamqRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqRouterResponseBody getBody() {
        return this.body;
    }

}
