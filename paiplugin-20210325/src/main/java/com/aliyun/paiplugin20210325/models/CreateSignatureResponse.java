// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class CreateSignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSignatureResponseBody body;

    public static CreateSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureResponse self = new CreateSignatureResponse();
        return TeaModel.build(map, self);
    }

    public CreateSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSignatureResponse setBody(CreateSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSignatureResponseBody getBody() {
        return this.body;
    }

}
