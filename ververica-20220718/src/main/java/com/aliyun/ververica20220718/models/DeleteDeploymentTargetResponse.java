// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteDeploymentTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeploymentTargetResponseBody body;

    public static DeleteDeploymentTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentTargetResponse self = new DeleteDeploymentTargetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeploymentTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeploymentTargetResponse setBody(DeleteDeploymentTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeploymentTargetResponseBody getBody() {
        return this.body;
    }

}
