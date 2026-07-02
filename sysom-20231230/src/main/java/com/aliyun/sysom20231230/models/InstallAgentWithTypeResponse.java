// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentWithTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallAgentWithTypeResponseBody body;

    public static InstallAgentWithTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentWithTypeResponse self = new InstallAgentWithTypeResponse();
        return TeaModel.build(map, self);
    }

    public InstallAgentWithTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallAgentWithTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallAgentWithTypeResponse setBody(InstallAgentWithTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallAgentWithTypeResponseBody getBody() {
        return this.body;
    }

}
