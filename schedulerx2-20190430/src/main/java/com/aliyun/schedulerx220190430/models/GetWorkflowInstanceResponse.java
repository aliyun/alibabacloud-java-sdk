// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowInstanceResponseBody body;

    public static GetWorkflowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceResponse self = new GetWorkflowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowInstanceResponse setBody(GetWorkflowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

}
