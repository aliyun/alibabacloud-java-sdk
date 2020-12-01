// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteIngressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIngressResponseBody body;

    public static DeleteIngressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIngressResponse self = new DeleteIngressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIngressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIngressResponse setBody(DeleteIngressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIngressResponseBody getBody() {
        return this.body;
    }

}
