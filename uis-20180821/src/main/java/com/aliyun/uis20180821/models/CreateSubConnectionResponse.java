// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateSubConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubConnectionResponseBody body;

    public static CreateSubConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubConnectionResponse self = new CreateSubConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubConnectionResponse setBody(CreateSubConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubConnectionResponseBody getBody() {
        return this.body;
    }

}
