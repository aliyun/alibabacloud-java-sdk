// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePolarClawAgentResponseBody body;

    public static UpdatePolarClawAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentResponse self = new UpdatePolarClawAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolarClawAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolarClawAgentResponse setBody(UpdatePolarClawAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolarClawAgentResponseBody getBody() {
        return this.body;
    }

}
