// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomAgentResponseBody body;

    public static UpdateCustomAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAgentResponse self = new UpdateCustomAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomAgentResponse setBody(UpdateCustomAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomAgentResponseBody getBody() {
        return this.body;
    }

}
