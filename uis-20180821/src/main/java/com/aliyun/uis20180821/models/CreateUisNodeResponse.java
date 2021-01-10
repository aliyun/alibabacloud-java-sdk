// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUisNodeResponseBody body;

    public static CreateUisNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUisNodeResponse self = new CreateUisNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateUisNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUisNodeResponse setBody(CreateUisNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUisNodeResponseBody getBody() {
        return this.body;
    }

}
