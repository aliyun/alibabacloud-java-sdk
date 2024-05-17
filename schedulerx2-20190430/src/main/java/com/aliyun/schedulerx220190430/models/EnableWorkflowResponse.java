// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class EnableWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableWorkflowResponseBody body;

    public static EnableWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWorkflowResponse self = new EnableWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public EnableWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableWorkflowResponse setBody(EnableWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWorkflowResponseBody getBody() {
        return this.body;
    }

}
