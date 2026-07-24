// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeploymentByNameResponseBody body;

    public static UpdateDeploymentByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentByNameResponse self = new UpdateDeploymentByNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeploymentByNameResponse setBody(UpdateDeploymentByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentByNameResponseBody getBody() {
        return this.body;
    }

}
