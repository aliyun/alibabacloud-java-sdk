// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RerunWorkflowNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RerunWorkflowNodeResponseBody body;

    public static RerunWorkflowNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RerunWorkflowNodeResponse self = new RerunWorkflowNodeResponse();
        return TeaModel.build(map, self);
    }

    public RerunWorkflowNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerunWorkflowNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RerunWorkflowNodeResponse setBody(RerunWorkflowNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RerunWorkflowNodeResponseBody getBody() {
        return this.body;
    }

}
