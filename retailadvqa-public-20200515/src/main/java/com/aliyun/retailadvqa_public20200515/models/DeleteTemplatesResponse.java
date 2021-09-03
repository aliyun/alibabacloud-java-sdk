// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class DeleteTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTemplatesResponseBody body;

    public static DeleteTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplatesResponse self = new DeleteTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplatesResponse setBody(DeleteTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTemplatesResponseBody getBody() {
        return this.body;
    }

}
