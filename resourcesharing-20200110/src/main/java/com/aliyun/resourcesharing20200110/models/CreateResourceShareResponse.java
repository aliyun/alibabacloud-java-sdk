// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CreateResourceShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceShareResponseBody body;

    public static CreateResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceShareResponse self = new CreateResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceShareResponse setBody(CreateResourceShareResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceShareResponseBody getBody() {
        return this.body;
    }

}
