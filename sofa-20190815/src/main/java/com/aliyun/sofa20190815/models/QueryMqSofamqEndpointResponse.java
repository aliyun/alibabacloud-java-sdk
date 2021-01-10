// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqEndpointResponseBody body;

    public static QueryMqSofamqEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqEndpointResponse self = new QueryMqSofamqEndpointResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqEndpointResponse setBody(QueryMqSofamqEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqEndpointResponseBody getBody() {
        return this.body;
    }

}
