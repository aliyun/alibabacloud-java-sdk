// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateAgentAuthModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentAuthModeResponseBody body;

    public static UpdateAgentAuthModeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentAuthModeResponse self = new UpdateAgentAuthModeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentAuthModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentAuthModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentAuthModeResponse setBody(UpdateAgentAuthModeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentAuthModeResponseBody getBody() {
        return this.body;
    }

}
