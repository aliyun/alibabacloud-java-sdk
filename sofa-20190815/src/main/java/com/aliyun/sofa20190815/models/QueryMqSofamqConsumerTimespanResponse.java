// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerTimespanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqConsumerTimespanResponseBody body;

    public static QueryMqSofamqConsumerTimespanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerTimespanResponse self = new QueryMqSofamqConsumerTimespanResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerTimespanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqConsumerTimespanResponse setBody(QueryMqSofamqConsumerTimespanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqConsumerTimespanResponseBody getBody() {
        return this.body;
    }

}
