// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class CreateSavepointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSavepointResponseBody body;

    public static CreateSavepointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSavepointResponse self = new CreateSavepointResponse();
        return TeaModel.build(map, self);
    }

    public CreateSavepointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSavepointResponse setBody(CreateSavepointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSavepointResponseBody getBody() {
        return this.body;
    }

}
