// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentWithTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallAgentWithTypeResponseBody body;

    public static UninstallAgentWithTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentWithTypeResponse self = new UninstallAgentWithTypeResponse();
        return TeaModel.build(map, self);
    }

    public UninstallAgentWithTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallAgentWithTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallAgentWithTypeResponse setBody(UninstallAgentWithTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallAgentWithTypeResponseBody getBody() {
        return this.body;
    }

}
