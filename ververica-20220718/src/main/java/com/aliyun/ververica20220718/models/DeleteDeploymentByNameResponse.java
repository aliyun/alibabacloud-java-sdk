// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteDeploymentByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeploymentByNameResponseBody body;

    public static DeleteDeploymentByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentByNameResponse self = new DeleteDeploymentByNameResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeploymentByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeploymentByNameResponse setBody(DeleteDeploymentByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeploymentByNameResponseBody getBody() {
        return this.body;
    }

}
