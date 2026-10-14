// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CheckAgentConfigSupportedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAgentConfigSupportedResponseBody body;

    public static CheckAgentConfigSupportedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAgentConfigSupportedResponse self = new CheckAgentConfigSupportedResponse();
        return TeaModel.build(map, self);
    }

    public CheckAgentConfigSupportedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAgentConfigSupportedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAgentConfigSupportedResponse setBody(CheckAgentConfigSupportedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAgentConfigSupportedResponseBody getBody() {
        return this.body;
    }

}
