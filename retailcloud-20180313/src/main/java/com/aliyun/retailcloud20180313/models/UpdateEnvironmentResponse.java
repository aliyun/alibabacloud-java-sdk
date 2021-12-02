// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnvironmentResponseBody body;

    public static UpdateEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentResponse self = new UpdateEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvironmentResponse setBody(UpdateEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvironmentResponseBody getBody() {
        return this.body;
    }

}
