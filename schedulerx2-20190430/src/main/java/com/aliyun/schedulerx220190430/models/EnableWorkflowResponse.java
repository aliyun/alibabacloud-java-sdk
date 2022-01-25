// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class EnableWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableWorkflowResponseBody body;

    public static EnableWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWorkflowResponse self = new EnableWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public EnableWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWorkflowResponse setBody(EnableWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWorkflowResponseBody getBody() {
        return this.body;
    }

}
