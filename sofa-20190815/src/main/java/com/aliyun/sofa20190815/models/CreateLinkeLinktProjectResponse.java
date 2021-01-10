// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktProjectResponseBody body;

    public static CreateLinkeLinktProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktProjectResponse self = new CreateLinkeLinktProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktProjectResponse setBody(CreateLinkeLinktProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktProjectResponseBody getBody() {
        return this.body;
    }

}
