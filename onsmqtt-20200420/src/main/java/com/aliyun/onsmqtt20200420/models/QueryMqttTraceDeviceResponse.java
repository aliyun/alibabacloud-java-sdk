// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqttTraceDeviceResponseBody body;

    public static QueryMqttTraceDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceDeviceResponse self = new QueryMqttTraceDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqttTraceDeviceResponse setBody(QueryMqttTraceDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqttTraceDeviceResponseBody getBody() {
        return this.body;
    }

}
