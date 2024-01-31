// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateAgentClientInstallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateAgentClientInstallResponseBody body;

    public static OperateAgentClientInstallResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAgentClientInstallResponse self = new OperateAgentClientInstallResponse();
        return TeaModel.build(map, self);
    }

    public OperateAgentClientInstallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateAgentClientInstallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateAgentClientInstallResponse setBody(OperateAgentClientInstallResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAgentClientInstallResponseBody getBody() {
        return this.body;
    }

}
