// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktTemplateResponseBody body;

    public static CreateLinkeLinktTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktTemplateResponse self = new CreateLinkeLinktTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktTemplateResponse setBody(CreateLinkeLinktTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktTemplateResponseBody getBody() {
        return this.body;
    }

}
