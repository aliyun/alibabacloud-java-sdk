// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqTraceByTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqTraceByTopicResponseBody body;

    public static QueryMqSofamqTraceByTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqTraceByTopicResponse self = new QueryMqSofamqTraceByTopicResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqTraceByTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqTraceByTopicResponse setBody(QueryMqSofamqTraceByTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqTraceByTopicResponseBody getBody() {
        return this.body;
    }

}
