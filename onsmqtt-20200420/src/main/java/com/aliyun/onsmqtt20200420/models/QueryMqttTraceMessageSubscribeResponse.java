// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessageSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMqttTraceMessageSubscribeResponseBody body;

    public static QueryMqttTraceMessageSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessageSubscribeResponse self = new QueryMqttTraceMessageSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessageSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqttTraceMessageSubscribeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMqttTraceMessageSubscribeResponse setBody(QueryMqttTraceMessageSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqttTraceMessageSubscribeResponseBody getBody() {
        return this.body;
    }

}
