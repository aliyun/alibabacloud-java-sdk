// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class CheckReadableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckReadableResponseBody body;

    public static CheckReadableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckReadableResponse self = new CheckReadableResponse();
        return TeaModel.build(map, self);
    }

    public CheckReadableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckReadableResponse setBody(CheckReadableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckReadableResponseBody getBody() {
        return this.body;
    }

}
