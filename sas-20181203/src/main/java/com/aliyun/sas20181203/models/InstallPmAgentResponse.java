// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallPmAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallPmAgentResponseBody body;

    public static InstallPmAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallPmAgentResponse self = new InstallPmAgentResponse();
        return TeaModel.build(map, self);
    }

    public InstallPmAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallPmAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallPmAgentResponse setBody(InstallPmAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallPmAgentResponseBody getBody() {
        return this.body;
    }

}
