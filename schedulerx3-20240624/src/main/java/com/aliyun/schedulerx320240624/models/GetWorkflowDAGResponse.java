// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetWorkflowDAGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowDAGResponseBody body;

    public static GetWorkflowDAGResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDAGResponse self = new GetWorkflowDAGResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDAGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowDAGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowDAGResponse setBody(GetWorkflowDAGResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowDAGResponseBody getBody() {
        return this.body;
    }

}
