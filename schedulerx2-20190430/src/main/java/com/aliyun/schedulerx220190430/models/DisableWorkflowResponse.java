// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DisableWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableWorkflowResponseBody body;

    public static DisableWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableWorkflowResponse self = new DisableWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DisableWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableWorkflowResponse setBody(DisableWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableWorkflowResponseBody getBody() {
        return this.body;
    }

}
