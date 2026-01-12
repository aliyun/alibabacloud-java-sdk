// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowResponseBody body;

    public static ListWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowResponse self = new ListWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowResponse setBody(ListWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowResponseBody getBody() {
        return this.body;
    }

}
