// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasAdminSshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasAdminSshResponseBody body;

    public static DeleteHasAdminSshResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasAdminSshResponse self = new DeleteHasAdminSshResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasAdminSshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasAdminSshResponse setBody(DeleteHasAdminSshResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasAdminSshResponseBody getBody() {
        return this.body;
    }

}
