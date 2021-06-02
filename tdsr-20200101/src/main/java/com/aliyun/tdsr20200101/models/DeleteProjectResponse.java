// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DeleteProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProjectResponseBody body;

    public static DeleteProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectResponse self = new DeleteProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectResponse setBody(DeleteProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectResponseBody getBody() {
        return this.body;
    }

}
