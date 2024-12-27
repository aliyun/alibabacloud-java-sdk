// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallAgentResponseBody body;

    public static UninstallAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentResponse self = new UninstallAgentResponse();
        return TeaModel.build(map, self);
    }

    public UninstallAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallAgentResponse setBody(UninstallAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallAgentResponseBody getBody() {
        return this.body;
    }

}
