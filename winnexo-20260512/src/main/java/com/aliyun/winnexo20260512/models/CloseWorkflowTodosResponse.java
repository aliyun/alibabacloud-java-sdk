// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CloseWorkflowTodosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseWorkflowTodosResponseBody body;

    public static CloseWorkflowTodosResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseWorkflowTodosResponse self = new CloseWorkflowTodosResponse();
        return TeaModel.build(map, self);
    }

    public CloseWorkflowTodosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseWorkflowTodosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseWorkflowTodosResponse setBody(CloseWorkflowTodosResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseWorkflowTodosResponseBody getBody() {
        return this.body;
    }

}
