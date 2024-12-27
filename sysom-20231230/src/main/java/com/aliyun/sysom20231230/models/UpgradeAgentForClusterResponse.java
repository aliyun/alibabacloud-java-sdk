// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentForClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeAgentForClusterResponseBody body;

    public static UpgradeAgentForClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentForClusterResponse self = new UpgradeAgentForClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentForClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeAgentForClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeAgentForClusterResponse setBody(UpgradeAgentForClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeAgentForClusterResponseBody getBody() {
        return this.body;
    }

}
