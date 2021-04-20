// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateComputeInstanceResponseBody body;

    public static CreateComputeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceResponse self = new CreateComputeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeInstanceResponse setBody(CreateComputeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeInstanceResponseBody getBody() {
        return this.body;
    }

}
