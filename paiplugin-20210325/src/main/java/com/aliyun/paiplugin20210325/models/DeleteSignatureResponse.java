// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class DeleteSignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSignatureResponseBody body;

    public static DeleteSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSignatureResponse self = new DeleteSignatureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSignatureResponse setBody(DeleteSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSignatureResponseBody getBody() {
        return this.body;
    }

}
