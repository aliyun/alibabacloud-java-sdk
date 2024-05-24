// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeploymentResponseBody body;

    public static DeleteDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentResponse self = new DeleteDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeploymentResponse setBody(DeleteDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeploymentResponseBody getBody() {
        return this.body;
    }

}
