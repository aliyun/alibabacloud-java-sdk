// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class CreateComputeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateComputeTaskResponseBody body;

    public static CreateComputeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskResponse self = new CreateComputeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeTaskResponse setBody(CreateComputeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeTaskResponseBody getBody() {
        return this.body;
    }

}
