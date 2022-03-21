// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DeleteResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceTypeResponseBody body;

    public static DeleteResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceTypeResponse self = new DeleteResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceTypeResponse setBody(DeleteResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceTypeResponseBody getBody() {
        return this.body;
    }

}
