// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateDeploymentTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeploymentTargetResponseBody body;

    public static CreateDeploymentTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTargetResponse self = new CreateDeploymentTargetResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeploymentTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeploymentTargetResponse setBody(CreateDeploymentTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeploymentTargetResponseBody getBody() {
        return this.body;
    }

}
