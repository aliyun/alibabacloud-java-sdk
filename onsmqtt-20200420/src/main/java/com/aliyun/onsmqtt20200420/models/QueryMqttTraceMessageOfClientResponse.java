// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessageOfClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMqttTraceMessageOfClientResponseBody body;

    public static QueryMqttTraceMessageOfClientResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessageOfClientResponse self = new QueryMqttTraceMessageOfClientResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessageOfClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqttTraceMessageOfClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMqttTraceMessageOfClientResponse setBody(QueryMqttTraceMessageOfClientResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqttTraceMessageOfClientResponseBody getBody() {
        return this.body;
    }

}
