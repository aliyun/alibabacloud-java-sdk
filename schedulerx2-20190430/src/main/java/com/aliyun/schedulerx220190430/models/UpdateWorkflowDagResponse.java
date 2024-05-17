// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkflowDagResponseBody body;

    public static UpdateWorkflowDagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowDagResponse self = new UpdateWorkflowDagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowDagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowDagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkflowDagResponse setBody(UpdateWorkflowDagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowDagResponseBody getBody() {
        return this.body;
    }

}
