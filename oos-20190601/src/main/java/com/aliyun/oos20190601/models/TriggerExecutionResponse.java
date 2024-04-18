// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TriggerExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerExecutionResponseBody body;

    public static TriggerExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerExecutionResponse self = new TriggerExecutionResponse();
        return TeaModel.build(map, self);
    }

    public TriggerExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerExecutionResponse setBody(TriggerExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerExecutionResponseBody getBody() {
        return this.body;
    }

}
