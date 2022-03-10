// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserTagMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserTagMetaResponseBody body;

    public static DeleteUserTagMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserTagMetaResponse self = new DeleteUserTagMetaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserTagMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserTagMetaResponse setBody(DeleteUserTagMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserTagMetaResponseBody getBody() {
        return this.body;
    }

}
