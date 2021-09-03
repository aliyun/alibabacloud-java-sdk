// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDefaultEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDefaultEventResponseBody body;

    public static CreateDefaultEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultEventResponse self = new CreateDefaultEventResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefaultEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefaultEventResponse setBody(CreateDefaultEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefaultEventResponseBody getBody() {
        return this.body;
    }

}
