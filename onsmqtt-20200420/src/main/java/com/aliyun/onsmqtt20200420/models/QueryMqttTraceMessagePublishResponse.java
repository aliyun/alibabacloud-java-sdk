// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessagePublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqttTraceMessagePublishResponseBody body;

    public static QueryMqttTraceMessagePublishResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessagePublishResponse self = new QueryMqttTraceMessagePublishResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessagePublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqttTraceMessagePublishResponse setBody(QueryMqttTraceMessagePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqttTraceMessagePublishResponseBody getBody() {
        return this.body;
    }

}
