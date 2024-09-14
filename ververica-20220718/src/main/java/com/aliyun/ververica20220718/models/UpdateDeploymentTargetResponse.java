// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeploymentTargetResponseBody body;

    public static UpdateDeploymentTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentTargetResponse self = new UpdateDeploymentTargetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeploymentTargetResponse setBody(UpdateDeploymentTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentTargetResponseBody getBody() {
        return this.body;
    }

}
