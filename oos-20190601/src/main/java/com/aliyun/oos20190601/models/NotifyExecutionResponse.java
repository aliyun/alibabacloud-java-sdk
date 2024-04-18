// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class NotifyExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NotifyExecutionResponseBody body;

    public static NotifyExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyExecutionResponse self = new NotifyExecutionResponse();
        return TeaModel.build(map, self);
    }

    public NotifyExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NotifyExecutionResponse setBody(NotifyExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyExecutionResponseBody getBody() {
        return this.body;
    }

}
