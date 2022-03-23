// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateSearchTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSearchTableResponseBody body;

    public static CreateSearchTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchTableResponse self = new CreateSearchTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateSearchTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSearchTableResponse setBody(CreateSearchTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSearchTableResponseBody getBody() {
        return this.body;
    }

}
