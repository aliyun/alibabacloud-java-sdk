// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentForClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallAgentForClusterResponseBody body;

    public static UninstallAgentForClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentForClusterResponse self = new UninstallAgentForClusterResponse();
        return TeaModel.build(map, self);
    }

    public UninstallAgentForClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallAgentForClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallAgentForClusterResponse setBody(UninstallAgentForClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallAgentForClusterResponseBody getBody() {
        return this.body;
    }

}
