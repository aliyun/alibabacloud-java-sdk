// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerAccumulateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqConsumerAccumulateResponseBody body;

    public static QueryMqSofamqConsumerAccumulateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerAccumulateResponse self = new QueryMqSofamqConsumerAccumulateResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerAccumulateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqConsumerAccumulateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMqSofamqConsumerAccumulateResponse setBody(QueryMqSofamqConsumerAccumulateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqConsumerAccumulateResponseBody getBody() {
        return this.body;
    }

}
