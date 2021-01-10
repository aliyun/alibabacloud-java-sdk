// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktWorkitemResponseBody body;

    public static CreateLinkeLinktWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktWorkitemResponse self = new CreateLinkeLinktWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktWorkitemResponse setBody(CreateLinkeLinktWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktWorkitemResponseBody getBody() {
        return this.body;
    }

}
