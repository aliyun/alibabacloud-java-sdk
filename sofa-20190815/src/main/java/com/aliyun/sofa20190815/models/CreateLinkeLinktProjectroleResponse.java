// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktProjectroleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktProjectroleResponseBody body;

    public static CreateLinkeLinktProjectroleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktProjectroleResponse self = new CreateLinkeLinktProjectroleResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktProjectroleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktProjectroleResponse setBody(CreateLinkeLinktProjectroleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktProjectroleResponseBody getBody() {
        return this.body;
    }

}
