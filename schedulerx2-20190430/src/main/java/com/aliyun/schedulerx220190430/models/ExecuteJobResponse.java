// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ExecuteJobResponse setBody(ExecuteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteJobResponseBody getBody() {
        return this.body;
    }

}
