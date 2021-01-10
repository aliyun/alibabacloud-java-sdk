// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUisResponseBody body;

    public static CreateUisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUisResponse self = new CreateUisResponse();
        return TeaModel.build(map, self);
    }

    public CreateUisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUisResponse setBody(CreateUisResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUisResponseBody getBody() {
        return this.body;
    }

}
