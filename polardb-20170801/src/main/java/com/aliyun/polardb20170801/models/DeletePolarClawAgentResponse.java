// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarClawAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolarClawAgentResponseBody body;

    public static DeletePolarClawAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarClawAgentResponse self = new DeletePolarClawAgentResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolarClawAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolarClawAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolarClawAgentResponse setBody(DeletePolarClawAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolarClawAgentResponseBody getBody() {
        return this.body;
    }

}
