// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktProjectroleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktProjectroleResponseBody body;

    public static DeleteLinkeLinktProjectroleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktProjectroleResponse self = new DeleteLinkeLinktProjectroleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktProjectroleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktProjectroleResponse setBody(DeleteLinkeLinktProjectroleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktProjectroleResponseBody getBody() {
        return this.body;
    }

}
