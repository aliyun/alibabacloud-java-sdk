// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDefaultEventSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDefaultEventSourceResponseBody body;

    public static CreateDefaultEventSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultEventSourceResponse self = new CreateDefaultEventSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefaultEventSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefaultEventSourceResponse setBody(CreateDefaultEventSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefaultEventSourceResponseBody getBody() {
        return this.body;
    }

}
