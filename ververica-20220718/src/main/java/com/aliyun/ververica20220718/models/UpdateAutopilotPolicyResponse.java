// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateAutopilotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutopilotPolicyResponseBody body;

    public static UpdateAutopilotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutopilotPolicyResponse self = new UpdateAutopilotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutopilotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutopilotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutopilotPolicyResponse setBody(UpdateAutopilotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutopilotPolicyResponseBody getBody() {
        return this.body;
    }

}
