// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class CreateResourceOrchestrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceOrchestrationResponseBody body;

    public static CreateResourceOrchestrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceOrchestrationResponse self = new CreateResourceOrchestrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceOrchestrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceOrchestrationResponse setBody(CreateResourceOrchestrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceOrchestrationResponseBody getBody() {
        return this.body;
    }

}
