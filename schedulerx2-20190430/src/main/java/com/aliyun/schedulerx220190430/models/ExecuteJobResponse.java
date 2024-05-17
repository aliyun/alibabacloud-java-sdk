// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteJobResponseBody body;

    public static ExecuteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteJobResponse self = new ExecuteJobResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteJobResponse setBody(ExecuteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteJobResponseBody getBody() {
        return this.body;
    }

}
