// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWorkflowResponseBody body;

    public static AddWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkflowResponse self = new AddWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorkflowResponse setBody(AddWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkflowResponseBody getBody() {
        return this.body;
    }

}
