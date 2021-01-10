// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktCustomfieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktCustomfieldResponseBody body;

    public static CreateLinkeLinktCustomfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktCustomfieldResponse self = new CreateLinkeLinktCustomfieldResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktCustomfieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktCustomfieldResponse setBody(CreateLinkeLinktCustomfieldResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktCustomfieldResponseBody getBody() {
        return this.body;
    }

}
