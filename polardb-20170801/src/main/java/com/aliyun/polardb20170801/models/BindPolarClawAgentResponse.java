// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class BindPolarClawAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindPolarClawAgentResponseBody body;

    public static BindPolarClawAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPolarClawAgentResponse self = new BindPolarClawAgentResponse();
        return TeaModel.build(map, self);
    }

    public BindPolarClawAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPolarClawAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindPolarClawAgentResponse setBody(BindPolarClawAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPolarClawAgentResponseBody getBody() {
        return this.body;
    }

}
