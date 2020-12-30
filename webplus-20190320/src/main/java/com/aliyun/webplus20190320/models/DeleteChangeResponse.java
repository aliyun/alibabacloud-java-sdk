// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeleteChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChangeResponseBody body;

    public static DeleteChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChangeResponse self = new DeleteChangeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChangeResponse setBody(DeleteChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChangeResponseBody getBody() {
        return this.body;
    }

}
