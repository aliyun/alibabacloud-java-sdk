// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class CreateResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceTypeResponseBody body;

    public static CreateResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceTypeResponse self = new CreateResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceTypeResponse setBody(CreateResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceTypeResponseBody getBody() {
        return this.body;
    }

}
