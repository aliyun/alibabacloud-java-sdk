// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateAIInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAIInstanceResponseBody body;

    public static CreateAIInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIInstanceResponse self = new CreateAIInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIInstanceResponse setBody(CreateAIInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIInstanceResponseBody getBody() {
        return this.body;
    }

}
