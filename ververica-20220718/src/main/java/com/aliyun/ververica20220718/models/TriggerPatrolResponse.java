// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TriggerPatrolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerPatrolResponseBody body;

    public static TriggerPatrolResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerPatrolResponse self = new TriggerPatrolResponse();
        return TeaModel.build(map, self);
    }

    public TriggerPatrolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerPatrolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerPatrolResponse setBody(TriggerPatrolResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerPatrolResponseBody getBody() {
        return this.body;
    }

}
