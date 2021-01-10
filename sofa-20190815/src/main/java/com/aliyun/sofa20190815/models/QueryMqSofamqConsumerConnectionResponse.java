// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqConsumerConnectionResponseBody body;

    public static QueryMqSofamqConsumerConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerConnectionResponse self = new QueryMqSofamqConsumerConnectionResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqConsumerConnectionResponse setBody(QueryMqSofamqConsumerConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqConsumerConnectionResponseBody getBody() {
        return this.body;
    }

}
