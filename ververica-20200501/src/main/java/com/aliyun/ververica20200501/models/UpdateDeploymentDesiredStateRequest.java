// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class UpdateDeploymentDesiredStateRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeploymentDesiredStateBody body;

    public static UpdateDeploymentDesiredStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentDesiredStateRequest self = new UpdateDeploymentDesiredStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentDesiredStateRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentDesiredStateRequest setBody(UpdateDeploymentDesiredStateBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentDesiredStateBody getBody() {
        return this.body;
    }

}
