// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktTagResponseBody body;

    public static CreateLinkeLinktTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktTagResponse self = new CreateLinkeLinktTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktTagResponse setBody(CreateLinkeLinktTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktTagResponseBody getBody() {
        return this.body;
    }

}
