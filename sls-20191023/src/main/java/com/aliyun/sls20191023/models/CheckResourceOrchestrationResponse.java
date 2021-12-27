// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class CheckResourceOrchestrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckResourceOrchestrationResponseBody body;

    public static CheckResourceOrchestrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceOrchestrationResponse self = new CheckResourceOrchestrationResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceOrchestrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourceOrchestrationResponse setBody(CheckResourceOrchestrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourceOrchestrationResponseBody getBody() {
        return this.body;
    }

}
