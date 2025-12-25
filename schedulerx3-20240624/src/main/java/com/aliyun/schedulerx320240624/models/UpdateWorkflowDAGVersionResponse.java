// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDAGVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkflowDAGVersionResponseBody body;

    public static UpdateWorkflowDAGVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowDAGVersionResponse self = new UpdateWorkflowDAGVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowDAGVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowDAGVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkflowDAGVersionResponse setBody(UpdateWorkflowDAGVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowDAGVersionResponseBody getBody() {
        return this.body;
    }

}
