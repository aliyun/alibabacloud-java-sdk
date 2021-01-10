// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteGWApiGroupAuthUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGWApiGroupAuthUserResponseBody body;

    public static DeleteGWApiGroupAuthUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWApiGroupAuthUserResponse self = new DeleteGWApiGroupAuthUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGWApiGroupAuthUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGWApiGroupAuthUserResponse setBody(DeleteGWApiGroupAuthUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGWApiGroupAuthUserResponseBody getBody() {
        return this.body;
    }

}
