// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentForClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallAgentForClusterResponseBody body;

    public static InstallAgentForClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentForClusterResponse self = new InstallAgentForClusterResponse();
        return TeaModel.build(map, self);
    }

    public InstallAgentForClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallAgentForClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallAgentForClusterResponse setBody(InstallAgentForClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallAgentForClusterResponseBody getBody() {
        return this.body;
    }

}
