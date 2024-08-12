// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UpdateTerminalPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTerminalPolicyResponseBody body;

    public static UpdateTerminalPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTerminalPolicyResponse self = new UpdateTerminalPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTerminalPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTerminalPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTerminalPolicyResponse setBody(UpdateTerminalPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTerminalPolicyResponseBody getBody() {
        return this.body;
    }

}
