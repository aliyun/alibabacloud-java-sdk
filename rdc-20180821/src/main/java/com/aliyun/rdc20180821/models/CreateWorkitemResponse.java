// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class CreateWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWorkitemResponseBody body;

    public static CreateWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemResponse self = new CreateWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkitemResponse setBody(CreateWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkitemResponseBody getBody() {
        return this.body;
    }

}
