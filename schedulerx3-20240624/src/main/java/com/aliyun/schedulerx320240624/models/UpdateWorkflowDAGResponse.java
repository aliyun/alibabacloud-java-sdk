// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDAGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkflowDAGResponseBody body;

    public static UpdateWorkflowDAGResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowDAGResponse self = new UpdateWorkflowDAGResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowDAGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowDAGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkflowDAGResponse setBody(UpdateWorkflowDAGResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowDAGResponseBody getBody() {
        return this.body;
    }

}
