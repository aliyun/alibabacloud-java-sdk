// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateWatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWatchTaskResponseBody body;

    public static UpdateWatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatchTaskResponse self = new UpdateWatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWatchTaskResponse setBody(UpdateWatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWatchTaskResponseBody getBody() {
        return this.body;
    }

}
