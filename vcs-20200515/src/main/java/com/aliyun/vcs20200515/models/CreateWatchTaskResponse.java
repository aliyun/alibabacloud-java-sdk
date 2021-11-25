// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateWatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWatchTaskResponseBody body;

    public static CreateWatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWatchTaskResponse self = new CreateWatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateWatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWatchTaskResponse setBody(CreateWatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWatchTaskResponseBody getBody() {
        return this.body;
    }

}
