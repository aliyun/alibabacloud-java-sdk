// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeploymentResponseBody body;

    public static UpdateDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentResponse self = new UpdateDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeploymentResponse setBody(UpdateDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentResponseBody getBody() {
        return this.body;
    }

}
