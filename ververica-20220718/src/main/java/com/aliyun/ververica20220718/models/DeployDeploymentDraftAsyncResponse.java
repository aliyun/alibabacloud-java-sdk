// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeployDeploymentDraftAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployDeploymentDraftAsyncResponseBody body;

    public static DeployDeploymentDraftAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployDeploymentDraftAsyncResponse self = new DeployDeploymentDraftAsyncResponse();
        return TeaModel.build(map, self);
    }

    public DeployDeploymentDraftAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployDeploymentDraftAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployDeploymentDraftAsyncResponse setBody(DeployDeploymentDraftAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployDeploymentDraftAsyncResponseBody getBody() {
        return this.body;
    }

}
