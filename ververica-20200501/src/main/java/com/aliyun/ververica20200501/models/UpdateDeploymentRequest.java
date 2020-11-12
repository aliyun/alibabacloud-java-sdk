// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class UpdateDeploymentRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeploymentBody body;

    public static UpdateDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentRequest self = new UpdateDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentRequest setBody(UpdateDeploymentBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentBody getBody() {
        return this.body;
    }

}
