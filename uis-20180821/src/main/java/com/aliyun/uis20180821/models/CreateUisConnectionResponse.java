// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUisConnectionResponseBody body;

    public static CreateUisConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUisConnectionResponse self = new CreateUisConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateUisConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUisConnectionResponse setBody(CreateUisConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUisConnectionResponseBody getBody() {
        return this.body;
    }

}
