// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktTagResponseBody body;

    public static DeleteLinkeLinktTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktTagResponse self = new DeleteLinkeLinktTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktTagResponse setBody(DeleteLinkeLinktTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktTagResponseBody getBody() {
        return this.body;
    }

}
