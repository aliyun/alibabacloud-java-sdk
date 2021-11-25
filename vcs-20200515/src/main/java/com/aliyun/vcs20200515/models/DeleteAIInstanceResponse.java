// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAIInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAIInstanceResponseBody body;

    public static DeleteAIInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIInstanceResponse self = new DeleteAIInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIInstanceResponse setBody(DeleteAIInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIInstanceResponseBody getBody() {
        return this.body;
    }

}
