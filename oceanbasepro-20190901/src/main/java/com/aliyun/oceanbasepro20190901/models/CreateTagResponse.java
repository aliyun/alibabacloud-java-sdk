// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTagResponseBody body;

    public static CreateTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagResponse self = new CreateTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagResponse setBody(CreateTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagResponseBody getBody() {
        return this.body;
    }

}
