// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetWorkflowExecutionDAGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowExecutionDAGResponseBody body;

    public static GetWorkflowExecutionDAGResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowExecutionDAGResponse self = new GetWorkflowExecutionDAGResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowExecutionDAGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowExecutionDAGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowExecutionDAGResponse setBody(GetWorkflowExecutionDAGResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowExecutionDAGResponseBody getBody() {
        return this.body;
    }

}
