// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktProjectResponseBody body;

    public static DeleteLinkeLinktProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktProjectResponse self = new DeleteLinkeLinktProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktProjectResponse setBody(DeleteLinkeLinktProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktProjectResponseBody getBody() {
        return this.body;
    }

}
