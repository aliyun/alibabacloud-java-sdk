// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWorkflowResponseBody body;

    public static DeleteWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowResponse self = new DeleteWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkflowResponse setBody(DeleteWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkflowResponseBody getBody() {
        return this.body;
    }

}
