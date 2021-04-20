// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotPersonTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAiotPersonTableResponseBody body;

    public static DeleteAiotPersonTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotPersonTableResponse self = new DeleteAiotPersonTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiotPersonTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiotPersonTableResponse setBody(DeleteAiotPersonTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiotPersonTableResponseBody getBody() {
        return this.body;
    }

}
