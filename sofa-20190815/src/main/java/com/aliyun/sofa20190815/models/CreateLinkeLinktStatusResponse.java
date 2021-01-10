// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktStatusResponseBody body;

    public static CreateLinkeLinktStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktStatusResponse self = new CreateLinkeLinktStatusResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktStatusResponse setBody(CreateLinkeLinktStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktStatusResponseBody getBody() {
        return this.body;
    }

}
