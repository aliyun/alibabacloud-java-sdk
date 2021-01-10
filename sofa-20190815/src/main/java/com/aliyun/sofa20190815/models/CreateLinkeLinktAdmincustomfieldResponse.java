// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktAdmincustomfieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktAdmincustomfieldResponseBody body;

    public static CreateLinkeLinktAdmincustomfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktAdmincustomfieldResponse self = new CreateLinkeLinktAdmincustomfieldResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktAdmincustomfieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktAdmincustomfieldResponse setBody(CreateLinkeLinktAdmincustomfieldResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktAdmincustomfieldResponseBody getBody() {
        return this.body;
    }

}
