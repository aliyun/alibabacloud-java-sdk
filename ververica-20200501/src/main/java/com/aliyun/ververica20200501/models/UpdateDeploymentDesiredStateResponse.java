// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class UpdateDeploymentDesiredStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeploymentDesiredStateResponseBody body;

    public static UpdateDeploymentDesiredStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentDesiredStateResponse self = new UpdateDeploymentDesiredStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentDesiredStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentDesiredStateResponse setBody(UpdateDeploymentDesiredStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentDesiredStateResponseBody getBody() {
        return this.body;
    }

}
