// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEditingProjectResponseBody body;

    public static DeleteEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectResponse self = new DeleteEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEditingProjectResponse setBody(DeleteEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEditingProjectResponseBody getBody() {
        return this.body;
    }

}
