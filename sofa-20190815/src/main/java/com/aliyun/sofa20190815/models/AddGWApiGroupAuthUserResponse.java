// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddGWApiGroupAuthUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddGWApiGroupAuthUserResponseBody body;

    public static AddGWApiGroupAuthUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGWApiGroupAuthUserResponse self = new AddGWApiGroupAuthUserResponse();
        return TeaModel.build(map, self);
    }

    public AddGWApiGroupAuthUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGWApiGroupAuthUserResponse setBody(AddGWApiGroupAuthUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGWApiGroupAuthUserResponseBody getBody() {
        return this.body;
    }

}
