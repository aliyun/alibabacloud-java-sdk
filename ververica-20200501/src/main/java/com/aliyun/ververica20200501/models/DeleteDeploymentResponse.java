// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class DeleteDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteDeploymentResponse setBody(DeleteDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeploymentResponseBody getBody() {
        return this.body;
    }

}
