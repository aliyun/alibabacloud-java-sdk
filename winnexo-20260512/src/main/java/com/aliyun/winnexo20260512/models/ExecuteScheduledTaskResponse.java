// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ExecuteScheduledTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteScheduledTaskResponseBody body;

    public static ExecuteScheduledTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScheduledTaskResponse self = new ExecuteScheduledTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteScheduledTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteScheduledTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteScheduledTaskResponse setBody(ExecuteScheduledTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteScheduledTaskResponseBody getBody() {
        return this.body;
    }

}
