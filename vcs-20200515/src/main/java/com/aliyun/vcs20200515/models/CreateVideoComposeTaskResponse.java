// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateVideoComposeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVideoComposeTaskResponseBody body;

    public static CreateVideoComposeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoComposeTaskResponse self = new CreateVideoComposeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoComposeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoComposeTaskResponse setBody(CreateVideoComposeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoComposeTaskResponseBody getBody() {
        return this.body;
    }

}
