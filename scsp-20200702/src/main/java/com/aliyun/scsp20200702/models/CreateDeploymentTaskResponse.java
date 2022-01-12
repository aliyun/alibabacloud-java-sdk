// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateDeploymentTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeploymentTaskResponseBody body;

    public static CreateDeploymentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTaskResponse self = new CreateDeploymentTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeploymentTaskResponse setBody(CreateDeploymentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeploymentTaskResponseBody getBody() {
        return this.body;
    }

}
