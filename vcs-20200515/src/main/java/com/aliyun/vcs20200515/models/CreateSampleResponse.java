// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateSampleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSampleResponseBody body;

    public static CreateSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleResponse self = new CreateSampleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSampleResponse setBody(CreateSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSampleResponseBody getBody() {
        return this.body;
    }

}
