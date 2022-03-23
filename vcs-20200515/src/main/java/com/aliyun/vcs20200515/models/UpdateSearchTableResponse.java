// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateSearchTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSearchTableResponseBody body;

    public static UpdateSearchTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSearchTableResponse self = new UpdateSearchTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSearchTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSearchTableResponse setBody(UpdateSearchTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSearchTableResponseBody getBody() {
        return this.body;
    }

}
