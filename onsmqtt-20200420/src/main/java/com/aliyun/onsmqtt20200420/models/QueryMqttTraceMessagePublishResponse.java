// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessagePublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryMqttTraceMessagePublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMqttTraceMessagePublishResponse setBody(QueryMqttTraceMessagePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqttTraceMessagePublishResponseBody getBody() {
        return this.body;
    }

}
