// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIngressResponseBody body;

    public static CreateIngressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressResponse self = new CreateIngressResponse();
        return TeaModel.build(map, self);
    }

    public CreateIngressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIngressResponse setBody(CreateIngressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIngressResponseBody getBody() {
        return this.body;
    }

}
