// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindUserResponseBody body;

    public static BindUserResponse build(java.util.Map<String, ?> map) throws Exception {
        BindUserResponse self = new BindUserResponse();
        return TeaModel.build(map, self);
    }

    public BindUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindUserResponse setBody(BindUserResponseBody body) {
        this.body = body;
        return this;
    }
    public BindUserResponseBody getBody() {
        return this.body;
    }

}
