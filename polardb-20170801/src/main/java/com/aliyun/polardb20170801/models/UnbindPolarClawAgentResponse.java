// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UnbindPolarClawAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindPolarClawAgentResponseBody body;

    public static UnbindPolarClawAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindPolarClawAgentResponse self = new UnbindPolarClawAgentResponse();
        return TeaModel.build(map, self);
    }

    public UnbindPolarClawAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindPolarClawAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindPolarClawAgentResponse setBody(UnbindPolarClawAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindPolarClawAgentResponseBody getBody() {
        return this.body;
    }

}
