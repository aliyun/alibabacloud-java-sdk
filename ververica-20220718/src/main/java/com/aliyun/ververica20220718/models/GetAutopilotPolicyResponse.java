// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetAutopilotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutopilotPolicyResponseBody body;

    public static GetAutopilotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutopilotPolicyResponse self = new GetAutopilotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetAutopilotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutopilotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutopilotPolicyResponse setBody(GetAutopilotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutopilotPolicyResponseBody getBody() {
        return this.body;
    }

}
