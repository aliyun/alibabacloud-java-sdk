// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteTemplateScratchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTemplateScratchResponseBody body;

    public static DeleteTemplateScratchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateScratchResponse self = new DeleteTemplateScratchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateScratchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplateScratchResponse setBody(DeleteTemplateScratchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTemplateScratchResponseBody getBody() {
        return this.body;
    }

}
